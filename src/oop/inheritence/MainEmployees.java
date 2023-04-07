package oop.inheritence;

public class MainEmployees {
    public static void main(String[] args) {

        Person esen = new Person("Esen", 25);
        Employees employees = new Employees("Asan", 31);
        Employees doha = new Employees("Doha", 36, 7);
        Employees isa = new Employees("Isa", 42, 3, "Tester");
        Education aida = new Education("Aida", 18, 2, "Tester", "Layer");

        Person joomart = new Employees("Joomart", 36, 5, "Tamada"); // от родителей к детям

        // Person = new Person
        // Person = new Employees
        // Person = new Education

        Actress penelopa = new Actress("Penelopa Cruz", 50);
        System.out.println(penelopa.greeting());

        Education obj = new Education("Object", 4);
    }
}
