package Lab5.Challenge3;

public class Main {
    public static void main(String[] args) {
        String rootValue = "a";
        Genericlist<String> list = new Genericlist<>(rootValue);


        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();
    }
}
