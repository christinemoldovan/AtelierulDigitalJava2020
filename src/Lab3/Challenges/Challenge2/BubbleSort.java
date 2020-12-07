package Lab3.Challenges.Challenge2;

public class BubbleSort implements SortingStrategy{


    public void BubbleSort(Integer[] arr)  {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }

    @Override
    public void sort(Integer[] list) {
        //print
        BubbleSort(list);

        for(int i=0;i<list.length;i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println();
    }
}
