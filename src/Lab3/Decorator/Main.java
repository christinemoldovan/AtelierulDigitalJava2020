package Lab3.Decorator;

public class Main {
    public static void main(String[] args) {

        Beverage bv1=new DarkRoast();
        bv1=new Milk(bv1);
        bv1=new Chocolate(bv1);
        bv1=new Whip(bv1);

        System.out.println("Cost="+bv1.getCost());
        System.out.println("Description of "+bv1.getDescription());

        Beverage bv2=new Caffe();
        bv2=new Milk(bv2);

        System.out.println("Cost="+bv2.getCost());
        System.out.println("Description of "+bv2.getDescription());

        Beverage bv3=new DarkRoast();
        bv3=new Chocolate(bv3);
        bv3=new Whip(bv3);

        System.out.println("Cost="+bv3.getCost());
        System.out.println("Description of "+bv3.getDescription());

    }
}
