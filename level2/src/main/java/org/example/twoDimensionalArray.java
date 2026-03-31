import java.util.Scanner;

public class MatrixExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows, cols;

        System.out.print("Enter rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter cols: ");
        cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.err.println("Invalid matrix size!");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Output
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}