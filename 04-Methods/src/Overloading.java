import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(4);
        fun("Harsh");
        demo("Harsh", "Anmol");
        demo(42);
    }

    static void demo(String... v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
