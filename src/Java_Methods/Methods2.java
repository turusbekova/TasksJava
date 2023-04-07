package Java_Methods;

public class Methods2 {
    public String greeting(String name){
        return "hello" + name;
    }
    public String greeting(String firstname, String lastname){
        return "hello" + firstname + lastname; //overloading-перезагрузка, когда одинковые имена но разные параметры

    }
    public int task(int num, int num2){
        return num * num2;
    }
}
// userdefind - методы которые мы создаем
//predefind - методы которые есть в библиотеке
