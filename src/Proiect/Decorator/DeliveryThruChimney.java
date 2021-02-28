package Proiect.Decorator;
public class DeliveryThruChimney extends MessageDecorator {
    //extending the class to create a different situation of delivery type
    public DeliveryThruChimney(MessageDelivery m){
        super(m);
    }
    //call parent class' deliverMessage() will get the letter and message ready
    public void deliverMessage(){
        super.deliverMessage();
        System.out.println("This message was sent through a chimney.");
    }
}
