package Proiect.Builder_Template;

public enum WandCores {
    phoenixTailFeather("Phoenix Tail Feather"),
    unicornTailHair("Unicorn Tail Hair"),
    veelaHair("Veela Hair"),
    dragonHeartString("Dragon HeartString");

    private final String title;
    WandCores(String title){
        this.title=title;
    }

    @Override
    public String toString() {
        return title;
    }
}
