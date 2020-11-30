package Lab3.Delegation;

public class Main {
    public static void main(String[] args) {
        Employer e=new Employer();
        PayCalc p=new PayCalc();
        e.calculatePay(p);
    }

}
