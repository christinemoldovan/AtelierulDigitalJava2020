package Lab5.Challenge2;

public class Heels implements Shoe{
    private String color;
    private int size;

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getColor() {
        return color;
    }

    public Heels(String color, int size) {
        this.color = color;
        this.size = size;
    }
}
