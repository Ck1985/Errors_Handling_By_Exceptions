package exceptions;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
public class ExceptionMethods {
    public static void main(String[] args){
        try {
            throw new Exception("MyException");
        }catch(Exception e){
            print("e.getMessage(): " + e.getMessage());
            print("e.getLocalizedMessage(): " + e.getLocalizedMessage());
            print("e.toString: " + e.toString());
            print("e.printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}
