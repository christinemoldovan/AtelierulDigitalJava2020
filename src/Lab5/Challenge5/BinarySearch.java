package Lab5.Challenge5;


import java.util.Comparator;

public class BinarySearch<T> {
    private T[] arr;
    private Comparator<T> comp;

    public boolean sorted() throws NewException{
        try {


        }catch(Exception e){
            NewException ex = new NewException("List isn't sorted!");
            throw ex;
        }
    }

    public BinarySearch(T[] numbers, Comparator<T> comparator) {
        arr = numbers;
        comp = comparator;
    }

    public BinarySearch(T[] arr) {
        this.arr = arr;
    }


    public void search(T val) {
        int first = 0;
        int last = arr.length - 1;
        boolean check = false;
        while (first <= last && check == false) {
            int mid = (first + last) / 2;
            T midVal = arr[mid];
            if (comp.compare(val, midVal) < 0) {
                first = mid - 1;
            } else if (comp.compare(val, midVal) > 0) {
                last = mid + 1;
            }
            if (arr[mid].equals(val)) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println(val);
        } else System.out.println("Cannot be found");
    }

}
