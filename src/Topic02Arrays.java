public class Topic02Arrays {

    public static void run() {
        System.out.println("=====Thema:Arrays=====");
        // all my code for this class start here:
        // 1. Creating arrays
        creatingArrays();

        // 2. Iterating arrays
        iteratingArrays();

        // 3. Modifying arrays
        modifyingArrays();

        // 4. Useful methods
        usefulMethods();

        // 5. Even numbers filter
        filterEven();
    }

    // 1. Ways to create an array
    static void creatingArrays() {
        System.out.println("---Creating Arrays---");

        //declare and fill later
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        //declare and fill immediately
        String[] names = {"Alice", "Bob", "Carol"};

        System.out.println("First number: " + numbers[0]);
        System.out.println("Last name: " + names[2]);
        System.out.println("Array length: " + numbers.length); // Check the array length
    }

    // 2.Iterating with for and for-each
    static void iteratingArrays() {
        System.out.println("---Iterating Arrays---");
        int[] scores = {85, 92, 78, 95, 60};

        // classic for loop - when you need the index
        for (int i = 0; i <= scores.length - 1; i++) {
            System.out.println("Index " + i + ": " + scores[i]);
        }

        //for-each - when you only need the value
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
    // 3. Modifying array values
    static void modifyingArrays() {
        System.out.println("---Modifying Arrays---");
        int[] numbers = {1, 2, 3, 4, 5};

        // multiply each element by 2
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i] * 2;
        }
        for (int n : numbers) {
            System.out.print(n + " "); // 2 4 6 8 10
        }
        System.out.println();
    }
    // 4. Arrays class — sort, copy, fill
    static void usefulMethods() {
        System.out.println("--- Useful Methods ---");
        int[] numbers = {5, 2, 8, 1, 9, 3};

        // sort
        java.util.Arrays.sort(numbers);
        for (int n : numbers) {
            System.out.print(n + " "); // 1 2 3 5 8 9
        }
        System.out.println();

        // copy
        int[] copy = java.util.Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copy length: " + copy.length);

        // find min and max manually
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }

    // 5. Filter — collect only even numbers
    static void filterEven() {
        System.out.println("--- Filter Even ---");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.print("Even numbers: ");
        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " "); // 2 4 6 8
            }
        }
        System.out.println();
    }
}



