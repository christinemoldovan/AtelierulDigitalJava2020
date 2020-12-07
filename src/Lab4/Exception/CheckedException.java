package Lab4.Exception;

public class CheckedException extends Exception {
    public CheckedException(String description){
        super("Checked " + description);
    }
}
