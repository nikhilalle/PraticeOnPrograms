package pratice.newJava.strings;

import java.util.Scanner;

public class TestPer1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage :" );
        int per = sc.nextInt();
        if (per >= 90 && per <= 100);
        {
            System.out.println("Excellent :: Grande A+");
        }
        if (per >= 80 && per <= 90);
        {
            System.out.println("Very Good :: Grande A");
        }
        if (per >= 70 && per <= 80);
        {
            System.out.println("Good :: Grande B+");
        }
        if (per >= 60 && per <= 80);
        {
            System.out.println("Average :: Grande B");
        }
        if (per >= 50 && per <= 60);
        {
            System.out.println("Not Bad :: Grande C+");
        }
        if (per >= 40 && per <= 50);
        {
            System.out.println("Just Passed :: Grande C+");
        }
        if (per >= 10 && per <= 40);
        {
            System.out.println("Excelent :: Grande Fail");
        }
    }
}
