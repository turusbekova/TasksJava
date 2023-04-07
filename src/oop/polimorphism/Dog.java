package oop.polimorphism;

public class Dog extends Animal{


    public Dog(String name, int age) {
        super(name, age);
    }

    public String voice(){
        return "Bark - bark!";
    }

    @Override
    public String voice(String name) {
        return null;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
