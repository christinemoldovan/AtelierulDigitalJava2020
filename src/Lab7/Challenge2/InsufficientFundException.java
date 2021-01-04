package Lab7.Challenge2;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){
        super("Not enough money in your account");
    }
}
