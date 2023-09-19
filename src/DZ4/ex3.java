package Hometasks;
import java.util.Random;
import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(2000, 1, 100);

        int[] modifiedArray = replaceEvenWithZeros(array);

        System.out.println("Масив після заміни:");
        System.out.println(Arrays.toString(modifiedArray));
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static int[] replaceEvenWithZeros(int[] array) {
        int[] modifiedArray = array.clone();

        for (int i = 0; i < modifiedArray.length; i++) {
            if (modifiedArray[i] % 2 == 0) {
                modifiedArray[i] = 0;
            }
        }

        return modifiedArray;
    }
}
