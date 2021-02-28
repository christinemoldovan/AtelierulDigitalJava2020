package Proiect.Decorator;

public abstract class MessageDecorator implements MessageDelivery {
    //decorator class is derived from Message Delivery
    //which is an abstract class
    private MessageDelivery message;
    public MessageDecorator(MessageDelivery m){
        message = m;
    }

    public void deliverMessage(){
        message.deliverMessage();
    }
}
