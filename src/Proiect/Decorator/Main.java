package Proiect.Decorator;

public class Main {
    // decorator pattern ( we have a code with basic functionality that needs to be implemented in different scenarios )
    public static void main(String[] args) {
        //calling the ways in which to deliver the message
        MessageDelivery m1 = new DeliveryThruChimney(new MessageDeliveryClass());
        m1.deliverMessage();
        System.out.println();

        MessageDelivery m2= new DeliveryThruHagrid(new DeliveryThruChimney(new MessageDeliveryClass()));
        m2.deliverMessage();
        System.out.println();

        MessageDelivery m3 = new DeliveryThruPost(new MessageDeliveryClass());
        m3.deliverMessage();
        System.out.println();

    }
}
