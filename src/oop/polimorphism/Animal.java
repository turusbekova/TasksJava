package oop.polimorphism;

public abstract class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String voice(){
        return "This is my voice!";
    }

    public abstract String voice(String name);
}
