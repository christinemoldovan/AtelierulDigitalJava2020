package Proiect.Decorator;
public class DeliveryThruPost extends MessageDecorator{
    //extending the class to create a different situation of delivery type
    public DeliveryThruPost(MessageDelivery m) {
        super(m);
    }
    //call parent class' deliverMessage() will get the letter and message ready
    public void deliverMessage() {
        super.deliverMessage();
        System.out.println( "This message was sent via the Postal Service.");
    }
}
