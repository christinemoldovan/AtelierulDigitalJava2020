package Lab5.Challenge4;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T>,IArrayIterator<T> {
    private T[] arr;
    private int pos=0;
    //same with ch1/lab3
    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if(pos >= arr.length){
            return false;
        }
        return true;
    }

    @Override
    public T next() {
        return arr[pos++];
    }
}
