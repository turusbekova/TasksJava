package oop.constructors;

public class Phone {

    public String mark;
    public String model;
    public double memory;
    public String color;
    public String os;
    protected float price;

    public Phone(String mark1, String model1, double memory1, String color1, String os1, float price1){
        mark = mark1;
        model = model1;
        memory = memory1;
        color = color1;
        os = os1;
        price = price1;
    }

    // alt + insert --> for calling constructor

    public Phone(String mark, String model, double memory, String color, String os){
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +

                "  model='" + model + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public String buyPhoneForKairat(){
        return model + " for Kairat";
    }
    public String buySamsungForKairat(){
        return "Heeey Kairat maybe Samsung?!";
    }




}
