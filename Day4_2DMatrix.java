import java.util.Scanner;

public class Day4_2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2];

        System.out.println("🧮 2x2 Matrix Determinant Calculator 🧮");
        System.out.println("-------------------------------------");
        System.out.println("Enter elements of the 2x2 matrix:");

        // Input Matrix
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Enter element at position [%d][%d]: ", i, j);
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display Matrix
        System.out.println("\n📋 Your 2x2 Matrix:");
        System.out.println("-------------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate Determinant
        int determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

        // Display Determinant
        System.out.println("\n🧾 Determinant Calculation:");
        System.out.printf("(%d × %d) - (%d × %d) = %d\n",
                matrix[0][0], matrix[1][1],
                matrix[0][1], matrix[1][0],
                determinant);

        System.out.println("\n✅ Determinant of the matrix is: " + determinant);
    }
}
