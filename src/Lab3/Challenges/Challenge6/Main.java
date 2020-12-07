package Lab3.Challenges.Challenge6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Cara");
        Person person2 = new Builder("Mark").setJob("Teacher").setUniversity("UTCN").setDrivingLicense(true).setisMarried(false).build();

        System.out.println(person1);
        System.out.println(person2);
    }
}
