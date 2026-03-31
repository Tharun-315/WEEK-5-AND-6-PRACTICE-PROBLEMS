import java.util.Scanner;

public class ErrorHandlingExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.err.println("Error: Negative number not allowed!");
            System.exit(0);
        }

        System.out.println("Valid number: " + num);
    }
}