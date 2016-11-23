package exceptions;

/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
class MyException extends Exception{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
public class FullConstructor {
    public static void f() throws MyException{
        System.out.println("Throw exception from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throw Exception from g()");
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
            e.printStackTrace(System.out);
        }
    }
}
