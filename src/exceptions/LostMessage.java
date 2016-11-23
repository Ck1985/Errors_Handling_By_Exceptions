package exceptions;
/**
 * Created by Anonymous11100001 on 7/31/2016.
 */
class VeryImportantException extends Exception{
    public String toString(){
        return "This is Very Important Exception";
    }
}
class HoHumException extends Exception{
    public String toString(){
        return "This is Trivial Exception";
    }
}
public class LostMessage {
    public void f() throws VeryImportantException{
        throw new VeryImportantException();
    }
    public void dispose() throws HoHumException{
        throw new HoHumException();
    }
    public static void main(String[] args){
        try{
            LostMessage lm = new LostMessage();
            try{
                lm.f();
            }finally{
                lm.dispose();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
