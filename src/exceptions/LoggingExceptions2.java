package exceptions;
import java.io.*;
import java.util.logging.*;

/**
 * Created by Anonymous11100001 on 7/24/2016.
 */
public class LoggingExceptions2 {
    private static final Logger LOGGER = Logger.getLogger("LoggingExceptions2");
    public static void loggingException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
    public static void main(String[] args){
        try{
            throw new NullPointerException();
        }catch(NullPointerException e){
            loggingException(e);
        }
    }
}
