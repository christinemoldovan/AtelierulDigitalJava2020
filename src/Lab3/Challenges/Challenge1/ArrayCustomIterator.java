package Lab3.Challenges.Challenge1;

public class ArrayCustomIterator implements Iterator{
    private int[] arr;
    private int index;

    public ArrayCustomIterator(int[] arr){
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        if(index >= arr.length){
            return false;
        }
        return true;
    }

    @Override
    public int next() {
        return arr[index++];
    }
}
