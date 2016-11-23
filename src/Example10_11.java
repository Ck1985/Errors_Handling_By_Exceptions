/**
 * Created by Anonymous11100001 on 7/27/2016.
 */
public class Example10_11 {
    private static void g() throws NewException1{
        System.out.println("Throwing Exception from g()");
        throw new NewException1("NewException1");
    }
    public static void f() throws NewException2{
        try{
            g();
        }catch(NewException1 e){
            System.out.println("Caught NewException1");
            System.out.println("Now throwing exception from f()");
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        try{
            f();
        }catch(Exception e){
            System.out.println("Caught NewException2");
            e.printStackTrace(System.out);
        }
    }
}
