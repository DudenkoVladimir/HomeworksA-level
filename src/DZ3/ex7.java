package DZ3;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        String withoutSpaces = removeSpaces(input);
        System.out.println("Рядок без пробілів: " + withoutSpaces);

        boolean isPalindrome = checkPalindrome(withoutSpaces);
        if (isPalindrome) {
            System.out.println("Рядок є паліндромом.");
        } else {
            System.out.println("Рядок не є паліндромом.");
        }

        int wordCount = countWords(input);
        System.out.println("Кількість слів у рядку: " + wordCount);
    }

    public static String removeSpaces(String input) {
        return input.replaceAll(" ", "");
    }

    public static boolean checkPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}
