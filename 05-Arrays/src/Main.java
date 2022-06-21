public class Main {
    public static void main(String[] args) {

        // int[] rnos = new int[5];
        // // or
        // int[] rnos2 = { 23, 43, 32, 65, 61 };

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; // initialization of array. ros is getting initialized in the heap.

        String[] names = new String[4];

        System.out.println(names[0]);

    }
}
