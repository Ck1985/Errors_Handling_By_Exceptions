package exceptions;
import java.io.*;
/**
 * Created by Anonymous11100001 on 8/2/2016.
 */
public class CleanUp {
    public static void main(String[] args){
        try{
            InputFile inputFile = new InputFile("C:\\Users\\CK1985\\IdeaProjects\\Errors_Handling_By_Exceptions\\sourceFile.txt");
            try{
                String s;
                while((s = inputFile.getLine()) != null){
                    //System.out.println(s);
                }
            }catch(RuntimeException e){
                System.out.println("getLine() errors");
                e.printStackTrace();
            }finally{
                inputFile.dispose();
            }
        }catch(Exception e){
            System.out.println("The Construction is not sucessfull");
        }
    }
}
