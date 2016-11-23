/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
import java.io.*;
import java.util.logging.*;

class ExceptionClass extends Exception{
    private static final Logger LOGGER = Logger.getLogger(ExceptionClass.class.getName());
    public void loggingException(){
        StringWriter trace = new StringWriter();
        this.printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
}
class ExceptionClass2 extends Exception{
    private static final Logger LOGGER = Logger.getLogger(ExceptionClass.class.getName());
    public void loggingException(){
        StringWriter trace = new StringWriter();
        this.printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
}
public class Example6 {
    public static void f() throws ExceptionClass{
        System.out.println("Throw exception from f()");
        throw new ExceptionClass();
    }
    public static void k() throws ExceptionClass2{
        System.out.println("Throw exceptionclass2 from k()");
        throw new ExceptionClass2();
    }
    public static void main(String[] args){
        try{
            f();
        }catch(ExceptionClass e){
            e.printStackTrace(System.out);
        }
        try{
            k();
        }
        catch(ExceptionClass2 e2){
            e2.printStackTrace(System.out);
        }
    }
}
