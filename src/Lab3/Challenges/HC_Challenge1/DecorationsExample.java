package Lab3.Challenges.HC_Challenge1;

public class DecorationsExample {
    public static void main(String[] args) {
        DecorableTree christmasTree= new ChristmasTree();
        //DecorableTree decoratedTree=new Garland(new Bulb(new Candy(christmasTree)));
        //decoratedTree.display();
        christmasTree.display();
    }
}
