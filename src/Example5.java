/**
 * Created by Anonymous11100001 on 7/22/2016.
 */
public class Example5 {
    private int[] num;
    private int length;
    private int bound;
    public Example5(int size){
        this.length = size;
        this.bound = this.length + 5;
        num = new int[length];
    }
    public void throwException(){
        for(int i = 0; i < bound; i++){
            if(i >= this.length){
                this.bound--;
            }
            num[i] = i;
        }
    }
    public static void main(String[] args){
        Example5 example5 = new Example5(6);
        do {
            try{
                example5.throwException();
                if(example5.bound == example5.length){
                    break;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.err.println("Exception still throwing...");
                System.out.println("Caught Exception");
                e.printStackTrace();
            }finally{
                System.out.println("Have we done ?");
            }
        }while(true);
        System.out.println("Ok we got it, we through over exception. Done");
    }
}
