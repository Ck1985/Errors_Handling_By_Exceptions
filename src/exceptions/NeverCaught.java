package exceptions;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/29/2016.
 */
public class NeverCaught {
    public static void f(){
        throw new RuntimeException("Exception throw from f()");
    }
    public static void g(){
        f();
    }
    public static void main(String[] args){
        g();
    }
}
