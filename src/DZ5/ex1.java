package DZ5;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        int[][] array = fillArray(rows, cols);

        printArray(array, "Масив після заповнення:");
    }

    public static int[][] fillArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value++;
            }

            if (i % 2 == 1) {
                for (int j = 0; j < cols; j++) {
                    array[i][j] *= -1;
                }
            }
        }

        return array;
    }

    public static void printArray(int[][] array, String message) {
        System.out.println(message);
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
