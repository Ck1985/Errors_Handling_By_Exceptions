/**
 * Created by Anonymous11100001 on 8/3/2016.
 */
class BaseException extends Exception{}
class BaseClass {
    public BaseClass() throws BaseException{
        throw new BaseException();
    }
}
class DerivedClass extends BaseClass{
    public DerivedClass() throws BaseException{
        // catch cluase wiouht try is not allowed
        //catch(Exception e)
        //This way is not allowed beaucause super must be the first statement
        /*try{
            super();
        }catch(BaseException e){

        }*/
        // So Constructor of Derived class can not caught exception
        // of Constructor base class
    }
}
public class Example21 {
    public static void main(String[] args){
        try{
            DerivedClass derivedClass = new DerivedClass();
        }catch(BaseException e){
            e.printStackTrace();
        }
    }
}
