/**
 * Created by Anonymous11100001 on 7/21/2016.
 */
package exceptions;
class SimpleException extends Exception{

}
public class InheritingException {
    public void f() throws SimpleException{
        System.out.println("throw new Exception from f() method");
        throw new SimpleException();
    }
    public static void main(String[] args){
        InheritingException sed = new InheritingException();
        try{
            sed.f();
        }catch(SimpleException e){
            System.out.println("Caught it");
        }
    }
}
