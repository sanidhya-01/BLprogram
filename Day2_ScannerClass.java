import java.util.Scanner;

public class Day2_ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("      STUDENT DETAILS FORM     ");
        System.out.println("===============================");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Roll Number: ");
        long roll_number = sc.nextLong();

        System.out.println("\n--------- STUDENT DETAILS ---------");
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Roll Number : " + roll_number);
        System.out.println("-----------------------------------");

        System.out.println("\nThank you for submitting the details!");

        sc.close();
    }
}
