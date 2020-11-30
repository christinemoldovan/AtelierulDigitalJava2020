package Lab3.Delegation;

public class PayCalc {
    public int calculate(String position){
        if(position.equals("pos1")){
            return 2000;
        }
        if(position.equals("manager")){
            return 3000;
        }
        return 1000;

    }
}
