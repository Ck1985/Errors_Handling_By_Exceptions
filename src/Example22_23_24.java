/**
 * Created by Anonymous11100001 on 8/3/2016.
 */
import java.io.*;
class Disposeable{
    private static long counter = 1;
    private final long id = counter++;
    public void dispose(){
        System.out.println("Disposing object Disposeable id: " + this.id);
    }
}
class FallingConstructor{
    private BufferedReader in;
    Disposeable d1;
    Disposeable d2;
    public FallingConstructor(String name) throws Exception{
        d1 = new Disposeable();
        try{
            this.in = new BufferedReader(new FileReader(name));
        }catch(FileNotFoundException e){
            e.printStackTrace();
            throw e;
        }catch(Exception e){
            try{
                this.in.close();
            }catch(IOException e2){
                e2.printStackTrace();
            }
            throw e;
        }finally{}
        d2 = new Disposeable();
    }
    public String getLine(){
        String s = null;
        try{
            s = this.in.readLine();
        }catch(IOException e){
            throw new RuntimeException("readLine() fail");
        }
        return s;
    }
    public void dispose(){
        try{
            this.in.close();
            System.out.println("dispose successful");
        }catch(IOException e2){
            throw new RuntimeException("close() is unsuccessful");
        }
    }
}
public class Example22_23_24 {
    public static void main(String[] args){
        try{
            FallingConstructor fallingConstructor = new FallingConstructor("C:\\Users\\CK1985\\IdeaProjects\\sourceFile.txt");
            try{
                String s;
                while((s = fallingConstructor.getLine()) != null){
                    //...............v
                }
            }catch(Exception e){
                System.out.println("Caught exception in main()");
            }finally{
                fallingConstructor.d2.dispose();
                fallingConstructor.d1.dispose();
                fallingConstructor.dispose();
            }
        }catch(Exception e){
            System.out.println("Construction fail");
        }
    }
}
