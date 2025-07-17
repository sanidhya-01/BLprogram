import java.util.Scanner;

/**
 * Day4_PrimeNumbers.java
 *
 * This program prints all prime numbers up to a user-specified number.
 * A prime number is a number that has exactly two divisors: 1 and itself.
 */

public class Day4_PrimeNumbers {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print(" Enter a number to print prime numbers up to: ");
        int n = sc.nextInt();

        System.out.println("\n Prime numbers from 1 to " + n + " are:\n");

        // Loop to print prime numbers
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n Program Completed Successfully!");
        sc.close();
    }
}
