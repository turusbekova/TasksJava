package HomeWorks;

public class HW2 {
    public static void main(String[] args) {

        float width = 5.6f;
        float height = 8.5f;
        int num = 2;

        float area = width * height;
        System.out.println("Area is " + width  + " * " + height + " = " + area);

        float perimeter = num * (width + height);
        System.out.println("Perimeter is " + num + " * " + "(" + width + height + ")" + " = " + perimeter);
    }
}
