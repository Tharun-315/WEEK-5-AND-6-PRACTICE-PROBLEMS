import java.util.Scanner;

public class MaxInMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = 2, cols = 2; // variables instead of hardcoding values

        int[][] matrix = new int[rows][cols];

        int max;

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        max = matrix[0][0];

        // Find max
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}