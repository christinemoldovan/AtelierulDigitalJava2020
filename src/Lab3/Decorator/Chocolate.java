package Lab3.Decorator;

public class Chocolate extends Topping {
    public Chocolate(Beverage wrappedBeverage) {
        super("Chocolate", 6, wrappedBeverage);
    }
}
