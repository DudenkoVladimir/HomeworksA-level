package DZ4;
import java.util.Random;

public class ex8 {
    public static void main(String[] args) {
        int[] array = generateRandomArray(400, 1, 10);

        double arithmeticMean = calculateArithmeticMean(array);
        double geometricMean = calculateGeometricMean(array);

        System.out.println("Середнє арифметичне: " + arithmeticMean);
        System.out.println("Середнє геометричне: " + geometricMean);
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    public static double calculateArithmeticMean(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static double calculateGeometricMean(int[] array) {
        double product = 1;

        for (int num : array) {
            product *= num;
        }

        return Math.pow(product, 1.0 / array.length);
    }
}
