package ua.univer.lesson09;

import java.util.AbstractList;
import java.util.Arrays;

public class MyList<Type> extends AbstractList<Type> {
    private Object[] arr;
    private int count;

    public MyList() {
        this.arr = new Object[10];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    public boolean add(Type value){
        arr[count] = value;
        count++;
        return true;
    }
    public Type get(int i){
      return (Type) arr[i];

    }
    public<T> T[] toArray(T[] a){
        return (T[]) Arrays.copyOf(arr,count, a.getClass());
    }
    @Override
    public String toString() {
        return "MyList{" +
                "arr=" + Arrays.toString(arr) +
                ", count=" + count +
                '}';
    }


}
