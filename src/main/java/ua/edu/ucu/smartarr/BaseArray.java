package main.java.ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private Object [] data;

    public BaseArray(Integer [] integers) {
        this.data = integers;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public String operationDescription() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
