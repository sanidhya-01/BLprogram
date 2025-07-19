import java.util.Scanner;
public class Day4_LargestElement {
  public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the Array:");
      int n=sc.nextInt();
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
          System.out.println("Enter"+i+" Element:");
          arr[i]=sc.nextInt();

      }
      int maxElement=arr[0];
      for(int i=0;i<n;i++){
          if(arr[i]>maxElement){
              maxElement=arr[i];
          }

      }
      System.out.println("Largest Element in the array is:"+maxElement);
  }
}
