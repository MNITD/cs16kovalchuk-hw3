package main.java.ua.edu.ucu.smartarr;

import main.java.ua.edu.ucu.functions.MyPredicate;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {

    //    private SmartArray sa;
    private MyPredicate pr;

    public FilterDecorator(SmartArray sa, MyPredicate pr) {
        super(sa);
//        this.sa = sa;
        this.pr = pr;
    }

    private Object[] filterArray(Object[] objs) {

        int counter = 0;
        for (int i = 0; i < objs.length; i++) {
            if (!pr.test(objs[i])) {
                objs[i] = null;
                counter++;
            }
        }
        Object[] result = new Object[objs.length - counter];
        int k = 0;
        for (int i = 0; i < objs.length; i++) {
            if (objs[i] != null) {
                result[k] = objs[i];
                k++;
            }
        }
        return result;
    }

    @Override
    public Object[] toArray() {
        return filterArray(super.smartArray.toArray().clone());
    }

    @Override
    public String operationDescription() {
        return "FilterDecorator";
    }

    @Override
    public int size() {
        return super.smartArray.size();
    }
}
