/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
public class BasicException {
    public static void main(String[] args){
        //Basic Exception
        Object t = "anonymous";
        if(t == null){
            throw new NullPointerException();
        }
        throw new NullPointerException("t = null");
    }
}
