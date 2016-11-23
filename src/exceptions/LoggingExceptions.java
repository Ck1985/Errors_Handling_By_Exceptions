package exceptions;
import java.util.logging.*;
import java.io.*;

/**
 * Created by Anonymous11100001 on 7/24/2016.
 */
//A Exception which reports through a logger:
class LoggingException extends Exception{
    private static final Logger LOGGER = Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        this.printStackTrace(new PrintWriter(trace));
        LOGGER.severe(trace.toString());
    }
}
public class LoggingExceptions{
    public static void main(String[] args){
        try{
            throw new LoggingException();
        }catch(LoggingException e){
            System.err.println("Caught " + e);
        }

        try{
            throw new LoggingException();
        }catch(LoggingException e){
            System.err.println("Caught " + e);
        }
    }
}
