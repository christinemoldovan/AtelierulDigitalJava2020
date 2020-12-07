package Lab3.Challenges.Challenge5;

public class DescBubbleSort extends TemplateBubbleSort{

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i2<i1){
            return true;
        }else return false;
    }

    @Override
    void sort(Integer[] list) {
        DescBubbleSort(list);
    }

    public void DescBubbleSort(Integer[] arr)  {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] < arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
