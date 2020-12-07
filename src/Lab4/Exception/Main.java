package Lab4.Exception;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.evaluate(-1));
        System.out.println(c.evaluate(-3));
    }
}
