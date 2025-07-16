//import java.util.Scanner;
//public class test {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Value");
//        int num = sc.nextInt();
//        int fact=1;
//        System.out.println("📋 Multiplication Table of " + num + ":");
//
//        for (int i = 1; i <= 10; i++) {
//            fact=fact*i;
//            System.out.println(num + " × " + i + " = " + fact);
//        }
//    }
//}


//WHILE LOOP
import java.util.Scanner;
public class Day3_TableOfNumber {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value:");
        int num = sc.nextInt();
        int i=1;
        System.out.println("📋 Multiplication Table of " + num + ":");
        while(i<=10){
        System.out.println(num+"x"+i+"= "+ (num*i));
        i++;
}
}
}