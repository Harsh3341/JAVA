public class StringExample {
    public static void main(String[] args) {
        // String message = greeting();
        // System.out.println(message);

        String personalised = myGreet("Harsh Gupta");
        System.out.println(personalised);

    }

    static String myGreet(String name) {
        String message = "Hello " + name + "!";
        return message;
    }

    // static String greeting() {
    // String greeting = "Hello World!";
    // return greeting;
    // }

}
