package Lab7.Challenge2;

public class BankAccount {
    private double debit;
    private String name;

    public BankAccount(double debit, String name){
        this.debit=debit;
        this.name=name;
    }
    public void Withdraw(double amount) throws InsufficientFundException {
        longDatabaseCall();
        if(debit >= amount) {
            this.debit -= amount;
            System.out.println("New amount after withdraw: " + debit);
        }else{
            throw new InsufficientFundException();
        }
    }
    public void Deposit(double amount){
        longDatabaseCall();
        this.debit += amount;
        System.out.println("New amount after deposit: " + debit);
    }

    private void longDatabaseCall(){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
