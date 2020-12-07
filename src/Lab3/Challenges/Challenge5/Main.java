package Lab3.Challenges.Challenge5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy1OfArr = Arrays.copyOf(arr,arr.length);
        Integer[] copy2OfArr = Arrays.copyOf(arr,arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy1OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy2OfArr);

        displaySorted(copy1OfArr);
        displaySorted(copy2OfArr);

    }
    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
