package interface1;

import javax.imageio.stream.IIOByteBuffer;

public class Phone implements Call, SendAMessage, TakeAPhoto {
    public String mark;
    public String model;
    private double memory;
    public String color;
    public String os;

    public Phone(String mark, String model, double memory, String color, String os) {
        this.mark = mark;
        this.model = model;
        this.memory = memory;
        this.color = color;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public String calling() {
        return "Ring Ring!";
    }

    @Override
    public String sendMessage() {
        return "Message from " + this.model;
    }

    @Override
    public String takeAPhoto() {
        return "Cheese!";
    }




}
