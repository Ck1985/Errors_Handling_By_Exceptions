package exceptions;
import java.io.*;
/**
 * Created by Anonymous11100001 on 8/4/2016.
 */
public class MainException {
    public static void main(String[] args) throws Exception{
        FileInputStream inputStream = new FileInputStream("C:\\Users\\CK1985\\IdeaProjects\\sourceFile.txt");
        inputStream.close();
    }
}
