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
class MeaningLessException extends Exception{
    public String toString(){
        return "This is MeaningLess Exception";
    }
}
public class Example18 {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    public void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public void eliminate() throws MeaningLessException{
        throw new MeaningLessException();
    }
    public static void main(String[] args){
        try{
            Example18 example18 = new Example18();
            try{
                example18.f();
                example18.dispose();
            }finally{
                example18.eliminate();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
