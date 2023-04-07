package oop.inheritence;

public class Employees extends Person {
    // employees расширяется от person, 1 класс унаследуется только одним классом
    // extends - наследование

      protected int experience;
      public String profession;

    public Employees(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public Employees(String name, int age, int experience, String profession) {
        super(name, age);
        this.experience = experience;
        this.profession = profession;
    }

    public Employees(String name, int age) {
          super(name, age);

      }
         // super class - parent class
         // sub class - son, daughter


    public String work(){
          return  "work work work ";
      }

}
