import java.util.Scanner;

public class ArrayBasicExample {
    public static void main(String[] args) {

        // Declare variables
        int size;
        Scanner scanner = new Scanner(System.in);

        // Input size with validation
        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size! Exiting...");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Access and print elements
        System.out.println("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}