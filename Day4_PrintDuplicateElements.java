import java.util.Scanner;
public class Day4_PrintDuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter" + i + "Element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Print Duplicate Elements:");
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i]== arr[j]) {
                    count++;
                    break;
                }
            }
            if(count==0){
            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
}