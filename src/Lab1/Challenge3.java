package Lab1;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge3 {

    public int pair(int[] arr, int n, int sum){
        int i,j;
        int nrPairs=0;

        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]!=0&&(arr[i]+arr[j])==sum){
                    System.out.print(arr[i]);
                    System.out.print(" ");
                    System.out.print(arr[j]);
                    System.out.print(" ");
                    System.out.print("\n");
                    arr[i]=0;
                    arr[j]=0;
                    nrPairs++;
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

        Challenge3 fnc = new Challenge3();
        System.out.print(fnc.pair(Array,n,0));


    }
}
