package main.java.ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray{

    private Object [] data;

    public BaseArray(Object [] integers) {
        this.data = integers;
    }

    @Override
    public Object[] toArray() {
        return data;
    }

    @Override
    public String operationDescription() {
        return "BaseArray";
    }

    @Override
    public int size() {
        return data.length;
    }
}
