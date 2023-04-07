package oop.polimorphism;

public class Cat extends Animal{

    String bread;
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, String bread) {
        super(name, age);
        this.bread = bread;
    }

//    public String voice(){
//        return "Meo meo!";
//    }

    @Override
    public String voice(){
        return "Meo meo";
    }

    @Override
    public String voice(String Secondname){ // String name - означает что нужно написать любое другое имя
        return this.name + " Myi myi";
    }

    public String voice(Cat cat){
        return cat.name + "MEO MEO";
    }


    // оверяйдится то что уже существует,
    // оверлод - в одном классе с разными параметрами а оверрайд - в разных классах но с одинаковыми параметрами

    // @Override - аннотация (сейчас данный метод будет переопределен)
    // override - переопределить (одни и те же методы,имена но реализация/действие разное) - в параллельных классах
    // overloading - перегрузитсья (только в текущем классе)
    // красная стрелка от родителя, белая - в классе детей тоже
    // полиморфизм - override,overload
    // статичный полиморфизм - overload, динамичный полиморфизм - override
    // interface - когда что-то одно используем по разномуФя
}
