package Lab2.Ch3;

public class Main {
    public static void main(String[] args) {
        //Animal cat = new Cat("Oscar");
        //cat.play(); //nu putem apela pt ca variabila e de tip Animal
        //Cat petCat=cat;
        //petCat.play();
        Cat cat = new Cat("Oscar");
        Animal animalCat=cat;
        //animalCat.play(); //nu merge
        cat.play();
        ((Pet)animalCat).play(); //asa merge
        ((Cat)animalCat).play(); //asa merge
    }
}
