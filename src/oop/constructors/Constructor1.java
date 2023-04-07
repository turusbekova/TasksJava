package oop.constructors;

public class Constructor1 {

    String mark;
    String model;
    String color;
    double volume;
    int wheel;
    int years;

    public String driving(){
        return model + " is driving";

    }

    public String beeping(){
        return model + " is beeping";
    }

    public void getInfo(){
        System.out.println("Mark: " + mark + "\n"
        + "Model: " + model + "\n"
        + "Color: " + color + "\n"
        + "Volume: " + volume + "\n"
        + "Wheel: " + color + "\n"
        + "Years: " + years + "\n");
    }

}
