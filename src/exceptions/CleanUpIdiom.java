package exceptions;

/**
 * Created by Anonymous11100001 on 8/2/2016.
 */
class NeedsCleanUp{
    private static long counter = 0;
    private final long id = counter++;
    public void dispose(){
        System.out.println("NeedsCleanUp " + id + " disposed");
    }
}
class ConstructorException extends Exception{}
class NeedsCleanUp2 extends NeedsCleanUp{
    public NeedsCleanUp2() throws ConstructorException{}
}
public class CleanUpIdiom {
    public static void main(String[] args){
        NeedsCleanUp nc1 = new NeedsCleanUp();
        try{

        }finally{
            nc1.dispose();
        }

        NeedsCleanUp nc2 = new NeedsCleanUp();
        NeedsCleanUp nc3 = new NeedsCleanUp();
        try{

        }finally{
            nc3.dispose();
            nc2.dispose();
        }

        try{
            NeedsCleanUp2 nc4 = new NeedsCleanUp2();
            try{
                NeedsCleanUp2 nc5 = new NeedsCleanUp2();
                try{

                }finally{
                    nc5.dispose();
                }
            }catch(ConstructorException e){
                System.out.println(e);
            }finally{
                nc4.dispose();
            }
        }catch(ConstructorException e){
            System.out.println(e);
        }
    }
}
