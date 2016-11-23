package exceptions;

/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
public class WhoCalled {
    public static void f(){
        try{
            throw new Exception();
        }catch(Exception e){
            for(StackTraceElement ste : e.getStackTrace()){
                System.out.println(ste.getMethodName());
            }
        }
    }
    public static void g(){f();}
    public static void h(){g();}
     public static void main(String[] args) {
          f();
         System.out.println("------------------");
         g();
         System.out.println("------------------");
         h();
     }
}
