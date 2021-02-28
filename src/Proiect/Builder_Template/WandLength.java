package Proiect.Builder_Template;

public enum WandLength {
    Short(11),
    Medium(14),
    Long(16);

    private final int nr;

    WandLength(int nr){
        this.nr=nr;
    }
    public String toString(){
        return Integer.toString(nr);
    }
}
