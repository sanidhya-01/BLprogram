import java.util.Scanner;
public class Day4_SumOfElements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter"+i+" Element:");
             arr[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the array is:"+sum);
    }
}
