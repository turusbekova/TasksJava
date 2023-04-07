package oop.abstract_methods;

public abstract class Phone1 {
    // abstract class - имеет 2 вида метода
    //1) обычный: void,return
    //2) абстрактный-не имеет тела, никогда нельзя создавать обьект
    // этот метод не может находиться в обычном классе
// по обычному классу мы создаем обьект а по абстрактному не можем,
// если хотим то нужно создавать по его наследованному классу

    public String phoneNumber;
    public int greenButton;
    public int redButton;
    public int callButton;
    public String mark;
    public String model;
    public float memory;

    public Phone1(String mark, String model, float memory) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
    }

    public String answer(){
        return "Alo Alo";
    }

    public String decline(){
        return "Tuut tuut tuuut";
    }

    public String call(String str){
        return "Calling";
    }

    public abstract String sendMessage();

    @Override
    public String toString() {
        return "Phone1{" +
                "greenButton='" + greenButton + '\'' +
                ", redButton='" + redButton + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                '}';
    }
}
