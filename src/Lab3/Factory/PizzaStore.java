package Lab3.Factory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String type);
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        //decide ce tip ii subclasa
        pizza.bake();
        pizza.slice();
        pizza.box();

        return pizza;
    }
}
