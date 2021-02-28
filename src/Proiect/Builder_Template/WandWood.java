package Proiect.Builder_Template;

public enum WandWood {
    ELDER,
    OAK,
    HOLLY,
    ASH,
    CHESTNUT;

    @Override
    public String toString() {
        return name().toLowerCase();
    }


}
