public class Topic01Methods {

    public static void run() {
        System.out.println("===== Theme: Methods =====");

        // 1. void - void method lol no returns.
        greet("Astrid");

        // 2. return - The method returns a value.
        System.out.println("55 + 33 = " + add(55, 33));
        System.out.println("55 * 33 = " + multiply(55, 33));
        System.out.println("25 / 5 = " + divide(25, 5));

        // 3. several parameters of different types.
        printPersonInfo("Astrid", 23);

        // 4. a method that calls another method.
        System.out.println("Perimeter of a Rectangle: " + perimeter(4, 5));

        // 5. method using String
        System.out.println(shout("Hello!^^"));

        // 6. method with boolean
        System.out.println("Is 5 even? " + isEven(5));
        System.out.println("Is 8 even? " + isEven(8));

        // 7. methods overloading
        System.out.println(describe(42));
        System.out.println(describe("Java"));
        System.out.println(describe(3.14));
    }
    // void - don't return anything
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // return int
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    // several parameters of different types
    static void printPersonInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // the method calls another method internally.
    static int perimeter(int width, int height) {
        return multiply(2, add(width, height));
    }
    // working with Strings
    static String shout(String text) {
        return text.toUpperCase() +"!!!";
    }
    // returns a boolean
    static boolean isEven(int n) {
        return n % 2 == 0;
    }
    // Overloading — same name, different parameters,
    static String describe(int n) {
        return "This is a number: " + n;
    }

    static String describe(String s) {
        return "his is a string: " + s;
    }

    static String describe(double d) {
        return "This is a fraction: " + d;
    }
}