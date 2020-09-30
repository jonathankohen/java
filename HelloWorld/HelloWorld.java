import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        Integer x = 3;
        String y = "hello";
        Boolean z = true;
        Double w = 3.14;

        System.out.println(1.0 / x);
        System.out.println(y.charAt(0) == 'h');
        System.out.println("Hello World");

        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("chips");
        snacks.add("almonds");
        snacks.add("snickers");
        snacks.add("pears");

        System.out.println(String.join(", ", snacks));

        if (w > 3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println(
            greeting("Mike")
        );

        greeting("Jon", "Kohen");

        greeting(5);
    }

    public static String greeting(String name) {
        return "Hello " + name;
    }

    public static void greeting(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    public static void greeting(Integer x) {
        for (int i=0; i<x; i++) {
            System.out.println("Greetings");
        }
    }
}