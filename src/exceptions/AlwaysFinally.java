package exceptions;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
public class AlwaysFinally {
    public static void main(String[] args){
        System.out.println("Entering the 1st try block");
        try{
            System.out.println("Entering the 2nd try block");
            try{
                throw new FourException();
            }finally{
                System.out.println("finally in the 2nd block");
            }
        }catch(Exception e){
            System.out.println("Caught the exception in the 1st try block");
        }finally{
            System.out.println("Finally in the 2nd try block");
        }
    }
}
