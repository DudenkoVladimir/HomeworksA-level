package DZ9;
public class ex2 {
    static void g() throws Exception {
        throw new Exception("Помилка у методі g()");
    }

    static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println("Помилка у методі f()");
            throw new Exception("Нова помилка у методі f()");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Помилка в методі main(): " + e.getMessage());
        }
    }
}
