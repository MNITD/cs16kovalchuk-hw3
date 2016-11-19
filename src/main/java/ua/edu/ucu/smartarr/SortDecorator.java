package main.java.ua.edu.ucu.smartarr;

import main.java.ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends  SmartArrayDecorator{

//    private SmartArray sa;
    private MyComparator cmp;

    public SortDecorator(SmartArray sa, MyComparator cmp) {
        super(sa);
//        this.sa = sa;
        this.cmp = cmp;
    }

    private Object[] sortArray(Object[] objs){
        Arrays.sort(objs, cmp);
        return objs;
    }

    @Override
    public Object[] toArray() {
        return sortArray(super.smartArray.toArray().clone());
    }

    @Override
    public String operationDescription() {
        return "SortDecorator";
    }

    @Override
    public int size() {
        return super.smartArray.size();
    }

}
