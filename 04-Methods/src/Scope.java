public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Harsh";

        {
            a = 78; // already initalized in the outer scope
            int c = 99;
            name = "Anmol";
            System.out.println(name);
            // values initalized in this block are not accessible outside of it
        }
        System.out.println(a);
        System.out.println(name);

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
