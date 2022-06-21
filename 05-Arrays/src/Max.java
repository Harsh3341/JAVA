public class Max {
    public static void main(String[] args) {
        int[] values = { 1, 3, 18, 41 };
        System.out.println(max(values));
    }

    static int max(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}