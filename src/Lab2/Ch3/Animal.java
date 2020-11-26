package Lab2.Ch3;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    //+ public - privat
    public void walk(){
        System.out.print("Walk");
    }

    public void eat(){
        System.out.print("Eat");
    }
}

