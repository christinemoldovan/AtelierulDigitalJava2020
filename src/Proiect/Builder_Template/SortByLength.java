package Proiect.Builder_Template;


public class SortByLength extends CompareWands{
    //template pattern
    @Override
    boolean condition(WandBuilder wand1, WandBuilder wand2) {
        return wand1.getWandLength().compareTo(wand2.getWandLength())>0;
    }
}
