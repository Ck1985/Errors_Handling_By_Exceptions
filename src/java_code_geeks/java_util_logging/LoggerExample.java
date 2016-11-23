/**
 * Created by Anonymous11100001 on 7/24/2016.
 */
package java_code_geeks.java_util_logging;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggerExample {
    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
    public static void main(String[] args) throws IOException, SecurityException{
        LOGGER.info("LOGGER Name: " + LOGGER.getName());
        LOGGER.warning("This can throw a ArrayBoundOutOfIndex");
        int[] array = new int[]{1,2,3};
        int length = 4;
        try{
            System.out.println("The array[4]: " + array[length]);
        }catch(ArrayIndexOutOfBoundsException e){
            LOGGER.log(Level.SEVERE, "Exception occur", e);
        }
    }
}
