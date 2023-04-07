package oop.constructors;

public class Constructor2 {
    String mark;
    String model;
    String color;
    double volume;
    int wheel;
    int years;

  // Метод Constructor - специальный метод
  // полностью похожий с текущим классом (название)
    public Constructor2(String mark1, String model1,String color1,
                        double volume1, int wheel1, int years1){

        mark = mark1;
        model = model1;
        color = color1;
        volume = volume1;
        wheel = wheel1;
        years = years1;
    }

    public String driving(){
        return model + " is driving";

    }

    public String beeping(){
        return model + " is beeping";
    }

}
