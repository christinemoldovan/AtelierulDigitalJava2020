package Proiect.Builder_Template;


public abstract class CompareWands {
    //template pattern
    //main class for all invocations, can't be used without the invocations
    void sortWands(WandBuilder[] wands) {
        for (int index1 = 0; index1 < wands.length - 1; index1++)
            for (int index2 = index1 + 1; index2 < wands.length; index2++)
                if (condition(wands[index1], wands[index2])) {
                    WandBuilder aux = wands[index1];
                    wands[index1] = wands[index2];
                    wands[index2] = aux;
                }
    }

    abstract boolean condition(WandBuilder wand1, WandBuilder wand2);

}
