import java.util.Scanner;

public class Day3_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("     🧮  Number Comparison App     ");
        System.out.println("===================================");

        System.out.print("🔢 Enter the Value of A: ");
        int a = sc.nextInt();

        System.out.print("🔢 Enter the Value of B: ");
        int b = sc.nextInt();

        System.out.print("🔢 Enter the Value of C: ");
        int c= sc.nextInt();

        System.out.print("🔢 Enter the Value of D: ");
        int d= sc.nextInt();

        String result =         (a > b && a>c && a>d) ? "A is Greater":
                                (b>c && b>a && b>d) ? "B is Greater":
                                (c>a && c>b && c>d) ? "C is Greater":
                                (d>a && d>b && d>c)? "D is Greater":
                                "All are equal";

        System.out.println("\n================ RESULT ================");
        System.out.println(result);
        System.out.println("========================================");
    }
}
