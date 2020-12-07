package Lab3.Challenges.Challenge5;

public abstract class TemplateBubbleSort {
    private Integer[] arr;

    void sort(Integer[] list){
        //make use of method numbersInCorrectOrder to sort array
        AscBubbleSort asc = new AscBubbleSort();
        DescBubbleSort desc = new DescBubbleSort();
        if(asc.numbersInCorrectOrder(1,9)==true){
            asc.sort(list);
        }else if(desc.numbersInCorrectOrder(9,1)==true){
            desc.sort(list);
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
