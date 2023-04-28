package forLoop;

import java.util.Arrays;

public class MissingElement {
    // Find the missing number in a given array


    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
        // get the array's length
        int n = arr.length;
        // the actual size is `n+1` since a number is missing from the array
        int m = n + 1;
        // get a sum of integers between 1 and `n+1`
        int total = m * (m + 1) / 2;
        // get an actual sum of integers in the array
        int sum = Arrays.stream(arr).sum();
        // the missing number is the difference between the expected sum
        // and the actual sum
        int a=total-sum;
        System.out.println("Missing Element 1 "+a);
        int sum2=(Arrays.stream(arr).sum())+a;
        int b=total-sum2;
        System.out.println("Missing Element 1 "+b);

    }
}
