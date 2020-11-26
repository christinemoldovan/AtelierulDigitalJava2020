package Lab2.Ch3;

public class Main {
    public static void main(String[] args) {
/*        Animal cat = new Cat("Oscar");
        cat.play(); //nu putem apela pt ca variabila e de tip Animal
        Cat petCat=cat;
        petCat.play();
        Cat cat = new Cat("Oscar");
        Animal animalCat=cat;
        //animalCat.play(); //nu merge
        cat.play();
        ((Pet)animalCat).play(); //asa merge
        ((Cat)animalCat).play(); //asa merge*/

        Fish f=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();
        /*f.eat();
        c.play();
        c.eat();
        a.eat();
        a.walk();
        e.eat();
        p.play();*/
        f.walk();
        f.setName("Fishy");
        String name2=f.getName();
        System.out.println(name2);


        Cat cat=new Cat();
        Animal animal=cat;
        cat.play();
        p.setName("Oscar");
        String name = p.getName();
        System.out.println(name);

    }
}
