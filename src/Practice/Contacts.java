package Practice;

public class Contacts {
    public String name;
    public int num;

    public Contacts(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Contacts(int num) {
        this.num = num;
    }

    public String receiveCall(){

        if (name == null){
            return "Unknown number is calling, please save this number";
        }

        return num + " - "+ name + "\n" + "is calling";
    }

    public boolean unknownNumber(){
        return true;
    }


}
