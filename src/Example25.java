/**
 * Created by Anonymous11100001 on 8/3/2016.
 */
class ExceptionLevel1 extends Exception{}
class ExceptionLevel2 extends ExceptionLevel1{}
class ExceptionLevel3 extends ExceptionLevel2{}
class A{
    public void f() throws ExceptionLevel1{
        throw new ExceptionLevel1();
    }
}
class B extends A{
    public void f() throws ExceptionLevel1 {
        throw new ExceptionLevel2();
    }
}
class C extends B{
    public static void main(String[] args){
        A c = new C();
        try{
            c.f();
        }catch(ExceptionLevel1 e){
            System.out.println("ExceptionLevel1");
        }
    }
}
public class Example25 {
}
