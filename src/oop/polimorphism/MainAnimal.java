package oop.polimorphism;

public class MainAnimal {
    public static void main(String[] args) {
        Kitten pussycat = new Kitten("Kate", 3,"Scottish vislauhaya");
        System.out.println(pussycat.name + ": " + pussycat.voice());

        Cat cat = new Cat("Lily", 2,"Siamskie");
        System.out.println(cat.name + ": " + cat.voice());
        System.out.println(cat.voice("Collins"));
        System.out.println("-->" + cat.voice());

        Dog dog = new Dog("Aktosh", 5);
        System.out.println(dog);
        System.out.println(dog.name + ": " + dog.voice());


    }
}
