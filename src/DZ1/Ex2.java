package DZ1;

public class Ex2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}