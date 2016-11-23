/**
 * Created by Anonymous11100001 on 7/31/2016.
 */
public class Example19 {
    public void f() throws VeryImportantException {
        throw new VeryImportantException();
    }
    public void dispose() throws HoHumException {
        throw new HoHumException();
    }
    public static void main(String[] args){
        try{
            Example19 example19 = new Example19();
            try{
                example19.f();
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                example19.dispose();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
