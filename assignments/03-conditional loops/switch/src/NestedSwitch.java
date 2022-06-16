import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 2:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 4:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 5:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
                break;
            case 6:
                switch (department) {
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "HR":
                        System.out.println("HR");
                        break;
                    case "Sales":
                        System.out.println("Sales");
                        break;
                    default:
                        System.out.println("Invalid department");
                        break;
                }
        }
    }
}
