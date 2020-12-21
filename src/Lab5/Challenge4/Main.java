package Lab5.Challenge4;

public class Main {

        public static void main(String[] args) {
            Integer[] arr = new Integer[]{1,2,3,4,5,6};
            IArrayIterator<Integer> it = new ArrayIterator<>(arr);
            while(it.hasNext()){
                System.out.print(it.next()+ " ");
            }
        }

}
