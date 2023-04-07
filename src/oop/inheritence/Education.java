package oop.inheritence;

public class Education extends Employees {

   private String diploma;

    public Education(String name, int age, int experience, String profession, String diploma) {
        super(name, age, experience, profession);
        this.diploma = diploma;
    }

    public Education(String name, int age, String diploma) {
        super(name, age);
        this.diploma = diploma;
    }

    public Education(String name, int age) {
        super(name, age);
        this.diploma = diploma;
    }

    public String getDiploma() {
        return diploma;
    }



}
