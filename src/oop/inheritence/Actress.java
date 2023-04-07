package oop.inheritence;

public class Actress extends Employees{


    public Actress(String name, int age) {
        super(name, age);
    }

    public String greeting(){
        return name + " Hello everyone!";
    }



    @Override
    public String toString() {
        return "Actress{" +
                "name='" + name + '\'' +
                " age='" + getAge() + '\'' +
                " action='" + work() +'\'' +
                " action2='" + speak() + '\'' +
                " oscar='" + oscar() + '\'' +
                '}';
    }
}
