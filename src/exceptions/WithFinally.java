package exceptions;

/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
public class WithFinally {
    private static Switch sw = new Switch();
    public static void main(String[] args){
        try{
            sw.on();
            OnOffSwitch.g();
            OnOffSwitch.f();
        }catch(OnOffException1 e){
            System.out.println("OnOffException1");
        }catch(OnOffException2 e){
            System.out.println("OnOffException2");
        }finally{
            sw.off();
        }
    }
}
