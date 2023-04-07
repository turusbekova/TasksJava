package oop.inheritence;

public class Person {
   public String name;
   private int age;

    public Person(String name, int age) {
        this.name = name; // ссылается на поля текущего класса
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String speak(){
        return "Bla Bla Bla";
    }

    public String oscar(){
        return "Oscar 1989";
    }
}
