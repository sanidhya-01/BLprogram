import java.util.Scanner;

public class Day4_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Find largest
        int largest = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Step 2: Find second largest correctly
        int secondLargest = -1; // Assume -1 in case no second largest is found

        for(int i=0; i<n; i++) {
            if(arr[i] != largest) {
                if(secondLargest == -1 || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }

        // Step 3: Output
        if(secondLargest == -1) {
            System.out.println("No second largest element (all elements are same).");
        }
        else {
            System.out.println("Second Largest Element is: " + secondLargest);
        }
    }
}
