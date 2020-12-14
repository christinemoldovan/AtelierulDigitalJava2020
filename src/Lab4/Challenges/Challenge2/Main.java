package Lab4.Challenges.Challenge2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        SecretMessage sm = new SecretMessage("./src/Lab4/Challenges/Challenge2/in.txt");
        System.out.println(sm);

    }
}