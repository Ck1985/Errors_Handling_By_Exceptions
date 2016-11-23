/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
public class Example1 {
    public static void f() throws MyException{
        System.out.println("Throwing exception from f() method");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing exception from g() method");
        throw new MyException("anonymous11100001");
    }
    public static void main(String[] args){
        try{
            f();
        }catch(MyException e){
            e.printStackTrace();
        }
        try{
            g();
        }catch(MyException e){
            System.err.println("Caught Exception");
            e.printStackTrace(System.err);
        }finally{
            System.out.println("Made it to finally");
        }
    }
}
