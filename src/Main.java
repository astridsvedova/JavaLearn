import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====Java Learn=====");
        System.out.println("1 - Methods");
        System.out.println("2 - Arrays");
        System.out.print("Choose thema: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Topic01Methods.run();
            case 2 -> Topic02Arrays.run();
            default -> System.out.println("These thema doesn't exist");
        }
        scanner.close();
    }
}