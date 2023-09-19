package Hometasks;
import java.util.ArrayList;
import java.util.List;

public class ex2 {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int num : numbers) {
            stringList.add(String.valueOf(num));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String str : strings) {
            doubledList.add(str + str);
        }
        return doubledList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Сума елементів: " + getSum(numbers));
        System.out.println("Непарні числа: " + getOddNumbers(numbers));
        System.out.println("Конвертований список: " + convertToStringList(numbers));

        List<String> strings = new ArrayList<>();
        strings.add("2i");
        List<String> doubledStrings = doubling(strings);
        System.out.println("Подвоєні строки: " + doubledStrings);
    }
}
