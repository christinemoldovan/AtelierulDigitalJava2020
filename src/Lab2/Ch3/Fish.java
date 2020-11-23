package Lab2.Ch3;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        super(0);
    }
    public String getName(){
        return name;
    }
    //generate methods
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Play like a fish.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println(" like a fish");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" like a fish");
    }
}
