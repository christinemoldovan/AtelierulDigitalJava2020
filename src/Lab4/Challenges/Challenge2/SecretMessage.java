package Lab4.Challenges.Challenge2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;


public class SecretMessage {

    public char[] readMessage(String filePath){
        char[] chars = new char[10000];
        try {

            BufferedReader br = new BufferedReader(new FileReader(filePath));
            int c;
            int count=0;
            while ((c=br.read()) != -1){
                chars[count++] = (char)c;
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return chars;
    }

    public SecretMessage(String path){
        char[] chars = readMessage(path);
        for(char c:chars){
            if(Character.isUpperCase(c)&&c!='X'){
                System.out.print(c);
            }
            if(Character.isUpperCase(c)&&c=='X'){
                System.out.print(" ");
            }
        }
    }


}