package pratice.newJava.array;

import java.util.Scanner;

public class ReversePalindromNo {
    public static void main(String[] args) {
        System.out.println("Enter a no of Number :");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        int rev;int sum=0;
        int temp=no;
        while (no>0){
            rev=no%10;
            sum=sum*10+rev;
            no=no/10;
        }
        if (sum==temp){
            System.out.println("Reverse  No :"+sum);
        }else {
            System.out.println("Reverse :"+sum);
        }
    }
}

