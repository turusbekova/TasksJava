package interface1;

public interface TakeAPhoto {

    default String takeAPhoto(){
        return "Say Cheeese! Chzhiik! :-)";
    }

    // private String takeAVideo(){  для конфиденциальности, чтобы повторяющееся действия можно было написать в прайват и
    // его переиспользоватьйй
//        return "hi";
//    }

    int COUNT = 1;
    String str = "Hello";





}
