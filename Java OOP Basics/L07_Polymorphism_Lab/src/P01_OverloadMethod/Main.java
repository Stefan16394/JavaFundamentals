package P01_OverloadMethod;

public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation=new MathOperation();
        System.out.println(mathOperation.sum(2,3));
        System.out.println(mathOperation.sum(2,3,4));
        System.out.println(mathOperation.sum(2, 3, 4, 5));
    }
}
