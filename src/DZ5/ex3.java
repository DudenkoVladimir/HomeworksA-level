package DZ5;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[][] originalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] modifiedArray = swapRowsAndColumns(originalArray);

        printArray(originalArray, "Початковий масив:");
        printArray(modifiedArray, "Масив після обміну стовпців і рядків:");
    }

    public static int[][] swapRowsAndColumns(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] modifiedArray = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                modifiedArray[i][j] = array[j][i];
            }
        }

        return modifiedArray;
    }

    public static void printArray(int[][] array, String message) {
        System.out.println(message);
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
