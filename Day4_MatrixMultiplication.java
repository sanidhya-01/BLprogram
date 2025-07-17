import java.util.Scanner;

public class Day4_MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] product = new int[2][2];

        // Input Matrix 1 using i and j
        System.out.println("Enter elements of Matrix1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        // Input Matrix 2 using p and q
        System.out.println("\nEnter elements of Matrix2:");
        for (int p = 0; p < 2; p++) {
            for (int q = 0; q < 2; q++) {
                System.out.print("Enter [" + p + "][" + q + "]: ");
                matrix2[p][q] = sc.nextInt();
            }
        }

        // Multiply Matrices
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display Matrix 1
        System.out.println("\nMatrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }

        // Display Matrix 2
        System.out.println("\nMatrix 2:");
        for (int p = 0; p < 2; p++) {
            for (int q = 0; q < 2; q++) {
                System.out.print(matrix2[p][q] + "\t");
            }
            System.out.println();
        }

        // Display Product Matrix
        System.out.println("\nProduct of Matrix1 and Matrix2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
