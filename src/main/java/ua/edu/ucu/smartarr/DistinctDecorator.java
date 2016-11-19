package main.java.ua.edu.ucu.smartarr;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
    }

    private Object[] deleteEqual(Object[] objs){
        int counter = 0;
        for(int i = 0; i < objs.length; i++){
            for(int j = i+1; j < objs.length; j++){
                if(objs[i] == null){
                    break;
                }
                if(objs[i].equals(objs[j])){
                    objs[j] = null;
                    counter++;
                }
            }
        }
        Object [] result = new Object[objs.length - counter];
        int k = 0;
        for (int i = 0 ; i < objs.length; i++ ){
            if(objs[i] != null){
                result[k] = objs[i];
                k++;
            }
        }
        return result;
    }

    @Override
    public Object[] toArray() {
       return deleteEqual(super.smartArray.toArray().clone());
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator";
    }

    @Override
    public int size() {
        return super.smartArray.size();
    }
}
