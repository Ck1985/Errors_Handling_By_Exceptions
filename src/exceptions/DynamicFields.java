package exceptions;

import java.util.NoSuchElementException;

/**
 * Created by Anonymous11100001 on 7/26/2016.
 */
class DynamicFieldsException extends Exception{

}
public class DynamicFields {
    private Object[][] fields;
    private int initilizeSize;

    public DynamicFields(int initilizeSize){
        this.initilizeSize = initilizeSize;
        fields = new Object[this.initilizeSize][2];
        for(int i = 0; i < this.initilizeSize; i++){
            fields[i] = new Object[] {null, null};
        }
    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(Object[] obj : this.fields){
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }
    private int hasField(String id){
        for(int i = 0; i < this.fields.length; i++){
            if(id.equals(fields[i][0])){
                return i;
            }
        }
        return -1;
    }
    private int getFieldNumber(String id) throws NoSuchFieldException{
        int fieldNumber = this.hasField(id);
        if(fieldNumber == -1){
            throw new NoSuchFieldException();
        }else{
            return fieldNumber;
        }
    }
    private int makeField(String id){
        for(int i = 0; i < fields.length; i++){
            if(this.fields[i][0] == null){
                this.fields[i][0] = id;
                return i;
            }
        }
        //If array fields has no empty element. we can add an empty:
        Object[][] fieldsTemp = new Object[this.initilizeSize + 1][2];
        for(int i = 0; i < this.initilizeSize + 1; i++){
            fieldsTemp[i] = new Object[]{null, null};
        }
        for(int i = 0; i < this.initilizeSize; i++){
            fieldsTemp[i] = fields[i];
        }
        fields = fieldsTemp;
        return makeField(id);
    }
    public Object getField(String id) throws NoSuchFieldException{
        if(this.getFieldNumber(id) == -1){
            throw new NoSuchElementException();
        }else{
            return (fields[this.getFieldNumber(id)][1]);
        }
    }
    public Object setField(String id, Object newValue) throws DynamicFieldsException{
        int fieldNumber = 0;
        if(newValue == null){
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }else {
            if (this.hasField(id) == -1) {
                fieldNumber = this.makeField(id);
            }
            Object result = null;
            try {
                result = this.getField(id);
            } catch (NoSuchFieldException e) {
                throw new RuntimeException(e);
            }
            fields[fieldNumber][1] = newValue;
            return result;
        }
    }
    public static void main(String[] args){
        DynamicFields df = new DynamicFields(3);
        System.out.println(df);
        try {
            df.setField("d", "A number for d");
            df.setField("Number1", 47);
            df.setField("Number2", 48);
            System.out.println(df);
            df.setField("d", "A new number for d");
            df.setField("Number3", 49);
            System.out.println("df: " + df);
            System.out.println("df.getField(\"d\"): " + df.getField("d"));
            Object field = df.setField("d", null);
        }catch(NoSuchFieldException e){
            e.printStackTrace(System.out);
        }catch(DynamicFieldsException e){
            e.printStackTrace(System.out);
        }
    }
}
