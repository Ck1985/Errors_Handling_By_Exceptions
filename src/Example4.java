/**
 * Created by Anonymous11100001 on 7/22/2016.
 */
public class Example4 {
    public static void f() throws MyException{
        System.err.println("The exception throw from f() method");
        throw new MyException("Exception anonymous11100001");
    }
    public static void main(String[] args){
        try{
            f();
        }catch(MyException myE){
            System.err.println("Caught the MyException");
            myE.printStackTrace();
            myE.showErr();
        }
    }
}
