package oop.polimorphism;

public class Kitten extends Cat{

    public Kitten(String name, int age, String bread) {
        super(name, age, bread);
    }

    public String voice(){
        return "muyyy";
    }

    @Override
    public String toString() {
        return "Kitten{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bread='" + bread + '\'' +
                '}';
    }
}
