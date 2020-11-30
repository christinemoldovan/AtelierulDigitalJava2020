package Lab3.Factory;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String type){
        Pizza pizza=null;
        if(type.equals("NYMargherita")){
            return new NYMargherita();
        }
        if(type.equals("NYQuatro")){
            return new NYQuatro();
        }
        return pizza;
    }
}
