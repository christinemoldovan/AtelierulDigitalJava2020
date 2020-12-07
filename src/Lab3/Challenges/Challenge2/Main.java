package Lab3.Challenges.Challenge2;

import java.util.Arrays;

public class Main {

    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);

    }

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{2,1,4,3,9,2,4};
        Integer[] copy1OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr,arr.length);

        displaySorted(new BubbleSort(),copy1OfArr);
        displaySorted(new MergeSort(),copy2OfArr);

    }
}
