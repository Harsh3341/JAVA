package maths;

public class Seive {
    public static void main(String[] args) {

        int n = 34;
        boolean[] nums = new boolean[n + 1];
        sieve(n, nums);

    }

    static void sieve(int a, boolean[] primes) {
        for (int i = 2; i * i <= a; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= a; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= a; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
