package exceptions;

/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws OnOffException1, OnOffException2{}
    public static void g(){
        throw new RuntimeException();
    }
    public static void main(String[] args){
        try{
            sw.on();
            f();
            g();
            sw.off();
        }catch(OnOffException1 e){
            System.out.println("OnOffException1");
            sw.off();
        }catch(OnOffException2 e){
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
