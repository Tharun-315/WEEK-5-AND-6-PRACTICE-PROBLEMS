import java.util.Scanner;

public class ModifyArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size!");
            System.exit(0);
        }

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value: ");
            arr[i] = scanner.nextInt();
        }

        // Modify (multiply each element by 2)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        // Output
        System.out.println("Modified Array:");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}