package exceptions;

/**
 * Created by Anonymous11100001 on 7/26/2016.
 */
class OneException extends Exception{
    public OneException(String msg){super(msg);}
}
class TwoException extends Exception{
    public TwoException(String msg){super(msg);}
}
public class ReThrowNew {
    public static void f() throws OneException{
        System.out.println("Originating in f()");
        throw new OneException("Throwing from f()");
    }
    public static void main(String[] args){
        try{
            try{
                f();
            }catch(Exception e){
                System.out.println("Caught inner try. e.printStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("Throwing from inner try");
            }
        }catch(Exception e){
            System.out.println("Caught outer try. e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
