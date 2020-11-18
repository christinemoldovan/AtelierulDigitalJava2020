package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge4 {
    public int pairthree(int[] arr, int n, int sum){
        int i,j,k;
        int nrPairs=0;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                for(k=j+1;k<n;k++){
                    if(arr[i]!=0&&(arr[i]+arr[j]+arr[k])==sum){
                        System.out.print(arr[i]);
                        System.out.print(" ");
                        System.out.print(arr[j]);
                        System.out.print(" ");
                        System.out.print(arr[k]);
                        System.out.print("\n");
                        arr[i]=0;
                        arr[j]=0;
                        arr[k]=0;
                        nrPairs++;


                    }
                }
            }
        }
        return nrPairs;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] Array;
        int n;
        System.out.print("Enter length of array:");
        n=scan.nextInt();
        Array=new int[n];

        System.out.println("Enter elements of the array:");
        for(int i=0;i<n;i++){
            Array[i]= Integer.parseInt(scan.next());
        }
        System.out.println(Arrays.toString(Array));

        Challenge4 fnc = new Challenge4();
        System.out.print(fnc.pairthree(Array,n,0));


    }
}
