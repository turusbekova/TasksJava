package oop.abstract_methods;

public class IOS extends Phone1{
    public IOS(String mark, String model, float memory) {
        super(mark, model, memory);
    }

    @Override
    public String sendMessage() {
        return "Text me!";
    }
}
