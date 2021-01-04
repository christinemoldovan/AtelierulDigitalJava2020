package Lab7.Challenge2;

public class TransactionThread extends Thread{
    private BankAccount from;
    private BankAccount to;
    private double amount;
    private String name;

    public TransactionThread(BankAccount from, BankAccount to, double amount, String name) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.name = name;
    }
    @Override
    public void run() {
        transfer(from,to,amount);
    }

    private void transfer(BankAccount from, BankAccount to, double amount){
        try{
            synchronized(from) {
                from.Withdraw(amount);
            }
            synchronized(to) {
                to.Deposit(amount);
            }
        }catch(InsufficientFundException e){
            System.out.println(e);
        }
    }

}
