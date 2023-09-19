package DZ1;

public class Ex3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
