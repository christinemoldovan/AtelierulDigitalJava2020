package Proiect.Builder_Template;

public class Main {
    // builder pattern (the class WandBuilder has many parameters and only a few are required, the others are optional)
    // template pattern (subclasses can override the method implementation, but the invocation is the same way as defined by the abstract class)
    static public void main(String[] args) {
        var firstCharacter = new WandBuilder.Builder(Characters.Ron,"Wandy",30)
                .withWandCores(WandCores.dragonHeartString)
                .withWandFlexibility(WandFlexibility.SWISHY)
                //.withWandWood(WandWood.ELDER) //it's an optional parameter
                .withWandLength(WandLength.Medium).build();


        var secondCharacter = new WandBuilder.Builder(Characters.Dumbledore, "Thunder", 80)
                //.withWandCores(WandCores.unicornTailHair) //it's an optional parameter
                .withWandFlexibility(WandFlexibility.FLEXIBLE)
                .withWandWood(WandWood.HOLLY)
                .withWandLength(WandLength.Short).build();


        var thirdCharacter = new WandBuilder.Builder(Characters.Voldemort, "DarkSoul", 70)
                .withWandCores(WandCores.veelaHair)
                .withWandFlexibility(WandFlexibility.INFLEXIBLE)
                .withWandWood(WandWood.ASH)
                .withWandLength(WandLength.Long).build();


        var forthCharacter = new WandBuilder.Builder(Characters.Hermione, "SunBurn", 60)
                .withWandCores(WandCores.phoenixTailFeather)
                .withWandFlexibility(WandFlexibility.FLEXIBLE)
                .withWandWood(WandWood.CHESTNUT)
                .withWandLength(WandLength.Medium).build();

        WandBuilder[] wands = {firstCharacter,secondCharacter,thirdCharacter,forthCharacter};
        System.out.println("\nThe wands created are:");
        print(wands);


        //template pattern
        SortByPrice sortByPrice = new SortByPrice();
        sortByPrice.sortWands(wands);
        System.out.println("\nWands sorted by price are:");
        print(wands);
        //template pattern
        SortByLength sortByLength = new SortByLength();
        sortByLength.sortWands(wands);
        System.out.println("\nWands sorted by length are:");
        print(wands);
        //template pattern
        SortByFlexibility sortByFlexibility = new SortByFlexibility();
        sortByFlexibility.sortWands(wands);
        System.out.println("\nWands sorted by flexibility are:");
        print(wands);


    }
    public static void print(WandBuilder[] wands) {
        System.out.println();

        for (WandBuilder w : wands)
            System.out.println(w);
    }

}
