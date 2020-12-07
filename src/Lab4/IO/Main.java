package Lab4.IO;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook =  new PhoneBook("./src/Lab4/IO/Input.txt");
        System.out.println(phoneBook);
        System.out.println("Abber: " + phoneBook.getByName("Abber"));
        System.out.println("Abdul: " + phoneBook.getByName("Abdul"));
    }
}
