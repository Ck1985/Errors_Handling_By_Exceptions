package exceptions;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/30/2016.
 */
public class MultiReturns {
    public static void f(int i){
        print("Initialization requires the clean up");
        try{
            print("Point 1:");
            if(i == 1) return;
            print("Pointer 2:");
            if(i == 2) return;
            print("Pointer 3");
            if(i == 3) return;
            print("End");
            return;
        }finally{
            print("Performing cleaan Up");
        }
    }
    public static void main(String[] args){
        for(int i = 1; i < 5; i++){
            f(i);
        }
    }
}
