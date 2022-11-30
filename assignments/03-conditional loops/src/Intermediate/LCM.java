package Intermediate;

public class LCM {
    public static void main(String[] args) {
        lcm(2, 3);
    }

    static void lcm(int a, int b) {

        int high = 2;
        int ans = 1;

        while (a != 1 || b != 1) {
            if ((a % high == 0) && (b % high == 0)) {
                a = a / high;
                b = b / high;
                ans = ans * high;
            } else if (a % high == 0) {
                a = a / high;
                ans = ans * high;
            } else if (b % high == 0) {
                b = b / high;
                ans = ans * high;
            } else {
                high++;
            }
        }

        System.out.println(ans);
    }
}
