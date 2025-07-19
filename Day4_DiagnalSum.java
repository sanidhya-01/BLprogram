import java.util.Scanner;
public class Day4_DiagnalSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 3*3 Matrix:");
        int[][] matrix=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Enter ["+i+"] ["+j+" ] Element:");
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display Matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(matrix[i][j]+" "+"\t");

            }
        }
        int Diagnal1=0;
        int Diagnal2=0;
        for(int i=0;i<3;i++){
                Diagnal1 += matrix[i][i];
                Diagnal2 += matrix[i][2 - i];

        }
        System.out.println("Diagnal1 Sum: "+Diagnal1);
        System.out.println("Diagnal2 Sum: "+Diagnal2);

    }
}
