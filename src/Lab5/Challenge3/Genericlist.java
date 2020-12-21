package Lab5.Challenge3;

public class Genericlist<T> implements IGenericList<T>{
    private T[] list;

    public Genericlist(T rootValue){
        list = (T[]) new Object[]{rootValue};
    }

    @Override
    public void insert(T element) {

    }

    @Override
    public void println() {

    }
}
