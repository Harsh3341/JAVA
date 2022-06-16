import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // String fruit = input.next();

        // switch (fruit) {
        // case "Mango" -> System.out.println("Mango is good");
        // case "Banana" -> System.out.println("Banana is good");
        // case "Apple" -> System.out.println("Apple is good");
        // default -> System.out.println("I don't know");
        // }

        int day = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }
}