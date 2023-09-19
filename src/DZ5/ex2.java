package DZ5;
public class ex2 {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 3, 1};

        boolean isOrderedDescending = checkOrderedDescending(array);
        System.out.println("Масив впорядкований по спаданню: " + isOrderedDescending);
    }

    public static boolean checkOrderedDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
