package Lab3.Decorator;

public class Whip extends Topping {
    public Whip(Beverage wrappedBeverage) {
        super("Whip", 5, wrappedBeverage);
    }
}
