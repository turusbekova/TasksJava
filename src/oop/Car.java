package oop;

public class Car {

// instance variables - переменные на уровне класс
    public String mark = "Mercedes";
    public String model = "S class";
    public String color = "black";
    public double capacity = 6.3;
    int year = 2015;
    public String countryOfOrigin = "Germany";

    public String driving(){
        int num = 10;  // local variable - переменная внутри класса
        return model + " is driving";
    }
     public String beep(){

        return "Beep Beep!!!";
     }

}


