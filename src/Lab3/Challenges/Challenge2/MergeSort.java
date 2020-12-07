package Lab3.Challenges.Challenge2;

public class MergeSort implements SortingStrategy {

    private static void mergeSort(Integer[]arr,int n){
        if(n<2){
            return;
        }
        int mid = n/2;
        Integer[] l = new Integer[mid];
        Integer[] r = new Integer[n-mid];

        for(int i=0; i < mid; i++){
            l[i] =arr[i];
        }
        for(int i=mid;i<n;i++){
            r[i-mid]=arr[i];
        }
        mergeSort(l,mid);
        mergeSort(r,n-mid);

        merge(arr,l,r,mid,n-mid);
    }
    private static void merge(Integer[] a, Integer[] l, Integer[] r, int left, int right){
        int i=0;int j=0; int k=0;
        while(i <left && j <right){
            if(l[i]<= r[j]){
                a[k++] = l[i++];
            }else {
                a[k++] = r[j++];
            }
        }
        while(i<left){
            a[k++] = l[i++];
        }
        while(j<right){
            a[k++] =r[j++];
        }
    }




    @Override
    public void sort(Integer[] list) {
        //print
        mergeSort(list,list.length);

        for(int i=0;i<list.length;i++) {
            System.out.print(list[i]+ " ");
        }
        System.out.println();
    }

}
