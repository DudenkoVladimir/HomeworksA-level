package DZ2;

public class Ex6 {
    public static void main(String[] args) {
        double num1 = -7.5;
        double num2 = 3.2;
        double num3 = -2.8;

        double minAbs = Math.min(Math.abs(num1), Math.min(Math.abs(num2), Math.abs(num3)));

        System.out.println("Менше за модулем число: " + minAbs);
    }
}
