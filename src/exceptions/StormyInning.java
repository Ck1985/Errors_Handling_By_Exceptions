package exceptions;

/**
 * Created by Anonymous11100001 on 8/1/2016.
 */
class BaseBallException extends Exception{}
class Foul extends BaseBallException{}
class Strike extends BaseBallException{}
abstract class Inning{
    public Inning() throws BaseBallException{}
    public void event() throws BaseBallException{}
    public abstract void atBat() throws Strike, Foul;
    public void walk(){}
}
class StormException extends Exception{}
class RainedOut extends StormException{}
class PopFoul extends Foul{}
interface Storm{
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}
public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseBallException{}
    public StormyInning(String s) throws Foul, BaseBallException{}
    //!public void walk() throws PopFoul{}
    /*public void event() throws RainedOut{}*/
    public void rainHard() throws RainedOut{}
    public void event(){}
    public void atBat() throws PopFoul{}
    public static void main(String[] args){
        try{
            StormyInning si = new StormyInning();
            si.atBat();
        }catch(PopFoul e){
            System.out.println("PopFoul");
        }catch(RainedOut e){
            System.out.println("RainedOut");
        }catch(BaseBallException e){
            System.out.println("BaseBallException");
        }

        try{
            Inning in = new StormyInning();
            in.atBat();
        }catch(Strike e){
            System.out.println("Strike");
        }catch(Foul e){
            System.out.println("Foul");
        }catch(RainedOut e){
            System.out.println("RainedOut");
        }catch(BaseBallException e){
            System.out.println("BaseBallException");
        }
    }
}
