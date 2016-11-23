
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
public class Example8 {
    public static void f() throws Exception{
        System.out.println("f() throw exception without specification");
        throw new Exception();
    }
    public static void main(String[] args){
        try{
            f();
        }catch(Exception e){
            System.out.println("Caught exception");
            e.printStackTrace();
        }
    }
}
