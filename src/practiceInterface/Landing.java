package practiceInterface;

public interface Landing {

    default String landing() {
        return "Приземлился";
    }
}
