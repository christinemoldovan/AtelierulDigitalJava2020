package Lab1;

import java.util.Arrays;

public class Challenge2 {

    String compute(int nr) {
        int i;

        String newString = "";
        String nrString = String.valueOf(nr);

        if (nr % 3 == 0)
            newString = newString.concat("Foo");
        if (nr % 5 == 0)
            newString = newString.concat("Bar");
        if (nr % 7 == 0)
            newString = newString.concat("Qix");

        for (i = 0; i < nrString.length(); i++) {
            char elem=nrString.charAt(i);
            if (elem== '3')
                newString = newString.concat("Foo");
            if (elem == '5')
                newString = newString.concat("Bar");
            if (elem == '7')
                newString = newString.concat("Qix");
        }
        if (newString.isEmpty())
            newString = String.valueOf(nr);
        return newString;
    }

    String compute2(int nr) {
        int i;
        boolean k=false;

        String newString = "";
        String nrString = String.valueOf(nr); //valueOf int

        if (nr % 3 == 0){
            newString = newString.concat("Foo");
            k=true;
        }

        if (nr % 5 == 0){
            newString = newString.concat("Bar");
            k=true;
        }

        if (nr % 7 == 0){
            newString = newString.concat("Qix");
            k=true;

        }
        for (i = 0; i < nrString.length(); i++) {
            char elem=nrString.charAt(i);
            if (k == true) {
                if (elem == '0')
                    newString=newString.concat("*");
                if (elem == '3')
                    newString = newString.concat("Foo");
                if (elem == '5')
                    newString = newString.concat("Bar");
                if (elem == '7')
                    newString = newString.concat("Qix");
            }
            else {
                if (elem != '0')
                    newString = newString.concat(String.valueOf(elem)); //valueOf char
                if (elem == '0')
                    newString=newString.concat("*");
            }
        }
        return newString;
    }

    public static void main(String[] args) {

        System.out.println("Challenge 2 - Stage 1");
        int i;
        Challenge2 fnc = new Challenge2();
        for (i = 1; i <= 53; i++) {
            System.out.print(fnc.compute(i) + " ");
        }

        System.out.println("\nChallenge 2 - Stage 2");
        int[] arr= new int[]{101, 303, 105, 10101};

        System.out.println(Arrays.toString(arr));

        for(i=0;i<arr.length;i++)
         System.out.print(fnc.compute2(arr[i]) + " ");

    }
}
