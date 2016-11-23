/**
 * Created by Anonymous11100001 on 7/22/2016.
 */
import java.io.*;
import java.util.logging.*;
public class Example3_7 {
    private int[] arrNumber;
    private int length;
    private static final Logger LOGGER = Logger.getLogger(Example3_7.class.getName());
    public Example3_7(int length){
        this.length = length;
        arrNumber = new int[this.length];
    }
    public void overloadArray(){
        for(int i = 0; i <= arrNumber.length; i++){
            arrNumber[i] = i;
        }
    }
    public static void loggingMethod(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
    public static void main(String[] args){
        Example3_7 example37 = new Example3_7(5);
        //This code will make array overloaded:
        //!example37.overloadArray();
        try{
            example37.overloadArray();
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Caught the ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            loggingMethod(e);
        }
    }
}
