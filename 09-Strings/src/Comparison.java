public class Comparison {
    public static void main(String[] args) {
        // String a = "Harsh";
        // String b = "Harsh";

        // // ==
        // System.out.println(a == b);

        String a = new String("Harsh");
        String b = new String("Harsh");

        System.out.println(a == b);
        System.out.println(a.equals(b)); // this is comparing values

        System.out.println(a.charAt(0));

    }
}
