import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');

        System.out.println("a" + "b");

        System.out.println((char) ('a' + 3));

        System.out.println("a" + 1); // when an integer is concatenated to string it is converted to a wrapper string

        System.out.println("Harsh" + new ArrayList<>());
        System.out.println("Harsh" + new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
