package DZ11;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ex2 {
    public static void addToArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
    }

    public static void addToLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
    }

    public static void getRandomElement(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int randomIndex = random.nextInt(list.size());
            int element = list.get(randomIndex);
        }
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        addToArrayList();
        long endTime = System.nanoTime();
        System.out.println("Час додавання до ArrayList: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        addToLinkedList();
        endTime = System.nanoTime();
        System.out.println("Час додавання до LinkedList: " + (endTime - startTime) + " нс");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        startTime = System.nanoTime();
        getRandomElement(arrayList);
        endTime = System.nanoTime();
        System.out.println("Час вибору з ArrayList: " + (endTime - startTime) + " нс");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        startTime = System.nanoTime();
        getRandomElement(linkedList);
        endTime = System.nanoTime();
        System.out.println("Час вибору з LinkedList: " + (endTime - startTime) + " нс");
    }
}
