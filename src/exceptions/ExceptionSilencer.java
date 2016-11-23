package exceptions;

/**
 * Created by Anonymous11100001 on 7/31/2016.
 */
public class ExceptionSilencer {
    public static void main(String[] args){
        try{
            throw new RuntimeException();
        }finally{
            //System.out.println("bac");
            return;
        }
    }
}
