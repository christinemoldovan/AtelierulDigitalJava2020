package Lab3.Decorator;

public class Milk  extends Topping{
    public Milk( Beverage wrappedBeverage) {
        super("Milk", 3, wrappedBeverage);
    }
}
