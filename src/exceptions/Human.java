package exceptions;

/**
 * Created by Anonymous11100001 on 8/3/2016.
 */
class Anonyance extends Exception{}
class Sneeze extends Anonyance{}
public class Human {
    public static void main(String[] args){
        try{
            throw new Sneeze();
        }catch(Sneeze e){
            System.out.println("Sneeze");
        }catch(Anonyance e){
            System.out.println("Anonyance");
        }

        try{
            throw new Sneeze();
        }catch(Anonyance e){
            System.out.println("Anonyance");
        }
    }
}
