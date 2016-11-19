package main.java.ua.edu.ucu.smartarr;

import main.java.ua.edu.ucu.functions.MyFunction;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{

//    private SmartArray sa;
    private MyFunction func;

    public MapDecorator(SmartArray sa,MyFunction func) {
        super(sa);
//        this.sa = sa;
        this.func = func;
    }

    private Object[] mapArray(Object[] objs){
        for(int i = 0; i < objs.length; i++){
           objs[i] = func.apply(objs[i]);
        }
        return objs;
    }

    @Override
    public Object[] toArray() {
        return mapArray(super.smartArray.toArray().clone());
    }

    @Override
    public String operationDescription() {
        return "MapDecorator";
    }

    @Override
    public int size() {
        return super.smartArray.size();
    }
}
