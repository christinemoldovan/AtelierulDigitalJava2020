package Lab5.Challenge2;

public class ShoesDontMatch extends Exception{
    public ShoesDontMatch(){
        super("Wrong params, they must have same color and size!");
    }
}
