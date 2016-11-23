package exceptions;
import java.io.*;
/**
 * Created by Anonymous11100001 on 8/1/2016.
 */
public class InputFile {
    private BufferedReader in;
    public InputFile(String name) throws Exception{
        try{
            in = new BufferedReader(new FileReader(name));
        }catch(FileNotFoundException e){
            System.out.println("Couldn't open this file");
            throw e;
        }catch(Exception e){
            try{
                in.close();
            }catch(IOException e2){
                System.out.println("Couldn't close this file");
            }
            throw e;
        }finally{

        }
    }
    public String getLine(){
        String s = null;
        try{
            s = this.in.readLine();
        }catch(IOException e){
            throw new RuntimeException("ReadLine() is failed");
        }
        return s;
    }
    public void dispose(){
        try{
            this.in.close();
            System.out.println("Dispose successfully");
        }catch(IOException e2){
            throw new RuntimeException("close() has failed");
        }
    }
}
