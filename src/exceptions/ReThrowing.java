package exceptions;

/**
 * Created by Anonymous11100001 on 7/26/2016.
 */
public class ReThrowing {
    public static void f() throws Exception{
        System.out.println("Originating the Exception in f()");
        throw new Exception("Throwing from f()");
    }
    public static void g() throws Exception{
        try{
            f();
        }catch(Exception e){
            System.out.println("Inside g(). e.printStackTrace()");
            e.printStackTrace(System.out);
            throw e;
        }
    }
    public static void h() throws Exception{
        try{
            f();
        }catch(Exception e){
            System.out.println("Inside h(). e.printStackTrace()");
            e.printStackTrace(System.out);
            throw (Exception)e.fillInStackTrace();
        }
    }
    public static void main(String[] args){
        try{
            g();
        }catch(Exception e){
            System.out.println("Inside main(). printStackTrace()");
            e.printStackTrace(System.out);
        }
        try{
            h();
        }catch(Exception e){
            System.out.println("Inside main(). printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}
