/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
public class MyException extends Exception{
    private String messageErr;
    public MyException(){}
    public MyException(String str){
        super(str);
        System.out.println("MyException(message)");
        this.messageErr = str;
    }
    public void showErr(){
        System.out.println("The message of Error; " + this.messageErr);
    }
}
