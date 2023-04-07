package oop.abstract_methods;

public class Android extends Phone1 {


    public Android(String mark, String model, float memory) {
        super(mark, model, memory);
    }

    @Override
    public String sendMessage() {
//        String msg1 = "I'm busy at the moment";
//        String msg2 = "Call me later";
        return " Typing from Android...";
    }
    String [] bla = {"I'm busy at the moment"," Call me later" };

    @Override
    public String call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;

    }


}
