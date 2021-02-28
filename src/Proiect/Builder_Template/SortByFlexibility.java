package Proiect.Builder_Template;


public class SortByFlexibility extends CompareWands{
    //template pattern
    @Override
    boolean condition(WandBuilder wand1, WandBuilder wand2) {
        return wand1.getWandFlexibility().compareTo(wand2.getWandFlexibility())>0;
    }
}
