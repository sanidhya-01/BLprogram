import java.util.Scanner;

public class Day4_MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[2][2];
        int[][] matrix2 = new int[2][2];
        int[][] sum = new int[2][2];


        System.out.println("Enter elements of Matrix1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }


        System.out.println("\nEnter elements of Matrix2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter [" + i + "][" + j + "]: ");
                matrix2[i][j] = sc.nextInt();
            }
        }


        System.out.println("\nMatrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nMatrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("\nSum of Matrix1 and Matrix2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
