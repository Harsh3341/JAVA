import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        // list.add(34);
        // list.add(56);
        // list.add(78);
        // list.add(90);
        // list.add(12);
        // list.add(34);
        // list.add(56);
        // list.add(78);
        // list.add(90);
        // list.add(12);
        // list.add(34);
        // list.add(56);

        // System.out.println(list.contains(99));
        // list.set(0, 99);
        // System.out.println(list);
        // list.remove(2);

        // System.out.println(list);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");
        }

    }
}
