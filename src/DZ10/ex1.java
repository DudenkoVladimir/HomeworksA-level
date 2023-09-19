package Hometasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        // Цикл for
        System.out.println("Цикл for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Цикл for-each
        System.out.println("Цикл for-each:");
        for (String element : list) {
            System.out.println(element);
        }

        // Цикл while
        System.out.println("Цикл while:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        // Ітератор
        System.out.println("Цикл ітератора:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
