/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
import java.util.*;
class NewException1 extends Exception{
    public NewException1(String str){
        super(str);
    }
}
class NewException2 extends Exception{
    public NewException2(String str){
        super(str);
    }
}
class NewException3 extends Exception{
    public NewException3(String str){
        super(str);
    }
}
public class Example9_13 {
    public static void throwAllException() throws NewException1, NewException2, NewException3{
        System.out.println("This method will throw all three Exceptions");
        Random random = new Random();
        int choosen = random.nextInt(3);
        switch(choosen){
            case 1:
                throw new NewException1("NewException1");
            case 2:
                throw new NewException2("NewException2");
            default:
                throw new NewException3("NewException3");
        }
    }
    public static void throwNullPointerException() throws NullPointerException{
        throw new NullPointerException();
    }
    public static void main(String[] args){
        try{
            throwAllException();
        }catch(NewException1 e){
            System.out.println("Caught exception1");
            e.printStackTrace(System.out);
        }catch(NewException2 e){
            System.out.println("Caught exception2");
            e.printStackTrace(System.out);
        }catch(NewException3 e){
            System.out.println("Caught exception3");
            e.printStackTrace(System.out);
        }
        // Or we can use only catch single to catch all three exception type
        try{
            throwAllException();
        }catch(Exception e){
            System.out.println("By using base class exception you can catch all type of Exception");
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Adding finally clause to verify that it is working ...");
        }

        try{
            throwNullPointerException();
        }catch(NullPointerException e){
            System.out.println("Caught NullPointerException");
        }finally{
            System.out.println("Finnaly clause still working although NUllPointerException thrown");
        }
    }

}
