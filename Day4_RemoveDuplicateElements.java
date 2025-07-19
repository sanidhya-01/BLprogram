import java.util.Scanner;
public class Day4_RemoveDuplicateElements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of The Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" Element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("After Removing Duplicates: ");
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    count++;
                    break;
                }
            }

        if(count==0){
            System.out.println(arr[i]+" ");
        }
    }
}
}