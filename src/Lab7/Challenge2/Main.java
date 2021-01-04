package Lab7.Challenge2;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(2000,"ba1");
        BankAccount ba2 = new BankAccount(4000,"ba2");
        BankAccount ba3 = new BankAccount(2500,"ba3");

        TransactionThread tt = new TransactionThread( ba1, ba2, 2000, "t1");
        TransactionThread tt2 = new TransactionThread( ba1, ba3,1900, "t2");

        tt.start();
        tt2.start();
    }
}
