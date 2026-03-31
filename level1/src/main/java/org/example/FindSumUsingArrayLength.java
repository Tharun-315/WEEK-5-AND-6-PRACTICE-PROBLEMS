import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size, sum = 0;

        System.out.print("Enter size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sum calculation
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);
    }
}