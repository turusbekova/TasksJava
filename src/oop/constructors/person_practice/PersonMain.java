package oop.constructors.person_practice;

public class PersonMain {
    public static void main(String[] args) {

        Person gulkaiyr = new Person("Gulkaiyr", 18,'f', "+996555123456");
        gulkaiyr.name = "Gul'chik";
        gulkaiyr.age = 21;
        gulkaiyr.getPhoneNumber();

        gulkaiyr.setPhoneNumber("+996500432534");
        System.out.println(gulkaiyr.name + " age: " + gulkaiyr.age + " gender: "
                + gulkaiyr.gender + " PhoneNumber: " + gulkaiyr.getPhoneNumber());



        System.out.println(gulkaiyr.toString());

        System.out.println(gulkaiyr.moving());

        // private instance variables --> getter/setter --> Encapsulation



    }



}
