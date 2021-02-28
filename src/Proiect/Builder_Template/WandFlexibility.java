package Proiect.Builder_Template;

public enum WandFlexibility {
    FLEXIBLE("flexible"),
    SWISHY("swishy"),
    INFLEXIBLE("inflexible");

    private final String title;

    WandFlexibility(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return title;
    }
}
