package Lab3.Factory;

public class Pizza {
    private String name;
    private String dough;

    public Pizza(String name, String dough) {
        this.name = name;
        this.dough=dough;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                '}';
    }

    public void bake(){
        System.out.println("Bake");
    }
    public void slice(){
        System.out.println("Slice");
    }
    public void box(){
        System.out.println("Box");
    }
}
