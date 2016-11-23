/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
public class Example2 {
    private static Integer number = null;
    public String method(){
        return number.toString();
    }
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        //System.out.println(example2.method());
        try{
            example2.method();
        }catch(NullPointerException e){
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        }
        try{
            number = 10;
            System.out.println(example2.method());
        }catch(NullPointerException e){
            System.err.println("Caught NullPointerException");
            e.printStackTrace();
        }finally{
            System.out.println("Get through the exception");
        }
    }
}
