package Proiect.Builder_Template;

public class SortByPrice extends CompareWands {
    //template pattern
    @Override
    boolean condition(WandBuilder wand1, WandBuilder wand2) {
        return wand1.getPrice() > wand2.getPrice();
    }
}
