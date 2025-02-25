package Array.JAVA_PROGRAMMING_BATCH;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       System.out.println("Enter the number:");
       int num=s.nextInt();
       int fact=1;
       for(int i=num; i>=1; i--){
        fact= fact *i;
       }
       System.out.println(num+"! = "+fact);
    }
}
