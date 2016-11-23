package exceptions;
import java.io.*;
import java.util.logging.*;
/**
 * Created by Anonymous11100001 on 7/25/2016.
 */
class MyException2 extends Exception {
    private int x;
    public MyException2(){}
    public MyException2(String msg){
        super(msg);
    }
    public MyException2(String msg, int x){
        super(msg);
        this.x = x;
    }
    public int value(){
        return this.x;
    }
    public String getMessage(){
        return "Detail Message: " + this.x + super.getMessage();
    }
}
public class ExtraFeatures {
    public static void f() throws MyException2{
        System.out.println("Throw exception from f()");
        throw new MyException2();
    }
    public static void g() throws MyException2{
        System.out.println("Throw exception from g()");
        throw new MyException2("Originated in g()");
    }
    public static void k() throws MyException2{
        System.out.println("Throw exception from k()");
        throw new MyException2("Originated in k()", 4);
    }
    public static void main(String[] args){
        try{
            f();
        }catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            g();
        }catch(MyException2 e){
            e.printStackTrace(System.out);
        }
        try{
            k();
        }catch(MyException2 e){
            e.printStackTrace(System.out);
            System.out.println("e.value(): " + e.value());
        }
    }
}
