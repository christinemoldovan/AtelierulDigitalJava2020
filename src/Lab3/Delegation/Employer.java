package Lab3.Delegation;

public class Employer {
    private String name;
    public void work(){
        System.out.println("Working");
    }
    public void calculatePay(PayCalc p){
        System.out.println("Rest to pay:"+p.calculate("pos2"));
    }
}
