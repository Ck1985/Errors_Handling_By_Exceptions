/**
 * Created by Anonymous11100001 on 8/1/2016.
 */
class BaseBallException extends Exception{}
class Foul extends BaseBallException {}
class Strike extends BaseBallException {}
class UmpireArguments extends BaseBallException{}
class ThrowFromGame extends UmpireArguments{}
abstract class Inning{
    public Inning() throws BaseBallException {}
    public void event() throws BaseBallException {}
    public abstract void atBat() throws Strike, Foul, UmpireArguments;
    public void questionCall() throws UmpireArguments{}
    public void walk(){}
}
class StormException extends Exception{}
class RainedOut extends StormException {}
class PopFoul extends Foul {}
interface Storm{
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}

public class Example20 extends Inning implements Storm {
    public Example20() throws RainedOut, BaseBallException {}
    public Example20(String s) throws Foul, BaseBallException {}
    //!public void walk() throws PopFoul{}
    /*public void event() throws RainedOut{}*/
    public void rainHard() throws RainedOut {}
    public void event(){}
    public void atBat() throws PopFoul, ThrowFromGame {
        throw new ThrowFromGame();
    }
    public void questionCall() throws UmpireArguments{
        throw new UmpireArguments();
    }
    public static void main(String[] args){
        try{
            Example20 si = new Example20();
            si.atBat();
            si.questionCall();
        }catch(PopFoul e){
            System.out.println("PopFoul");
        }catch(RainedOut e){
            System.out.println("RainedOut");
        }catch(UmpireArguments e){
            System.out.println("UmpireArgument");
        }catch(BaseBallException e){
            System.out.println("BaseBallException");
        }

        try{
            Inning in = new Example20();
            in.atBat();
            in.questionCall();
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
