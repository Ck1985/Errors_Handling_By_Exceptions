package exceptions;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
class ThreeException extends Exception{

}
public class FinallyWorks {
    private static int count = 0;
    public static void main(String[] args){
        while(true){
            try{
                if (count++ == 0) {
                    throw new ThreeException();
                }
                System.out.println("No Exception");
            }catch(ThreeException e){
                System.out.println("ThreeException caught");
            }finally{
                System.out.println("In finally clause");
                if(count == 2){
                    break;
                }
            }
        }
    }
}
