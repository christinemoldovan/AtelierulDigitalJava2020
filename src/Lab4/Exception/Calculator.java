package Lab4.Exception;

public class Calculator {
    private int calc(int i) throws CheckedException{
        if(i<0){
            CheckedException e = new CheckedException("The input value is to small.");
            throw e;
        }
        return 10/i;
    }

    public int evaluate(int input){
        try{
            return input+calc(input);
        }catch(CheckedException e){
            if(input == -3){
                UncheckedException ex = new UncheckedException("Input is -3.");//nu se mai poate reveni
                throw ex;
            }
            return input + 20;
            //daca facem return input + calc(20) punem dupa
            //evaluate throws, nu mai facem try catch aici
            //si cand apelam iar evaluate altundeva face try catch
        }

    }
}
