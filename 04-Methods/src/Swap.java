public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);

        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
