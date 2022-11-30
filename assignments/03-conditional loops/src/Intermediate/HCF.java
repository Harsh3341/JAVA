package Intermediate;

public class HCF {
    public static void main(String[] args) {
        hcf(2, 3);
    }

    static void hcf(int a, int b) {
        int high = 2;
        int temp = 1;

        int min = a < b ? a : b;

        while (high <= min && (a != 1 && b != 1)) {
            if (a % high == 0 && b % high == 0) {
                temp = temp * high;
                a = a / high;
                b = b / high;

            } else {
                high++;
            }
        }
        System.out.println(temp);
    }
}
