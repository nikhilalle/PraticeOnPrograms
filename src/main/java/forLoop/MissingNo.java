package forLoop;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNo {
    @Test
    public void missingNumber() {
        int i;
        int j = 1;
        int arr[] = {1, 6, 3, 9, 4, 7, 11};
        Arrays.sort(arr);

        System.out.println("-------------");
        for (i = 0; i <= arr.length - 1; i++) {

            if (arr[i] == j) {
                j++;
            } else {
                System.out.println("    " + j);
                j = j + 2;
            }
        }

    }

    @Test
    public void missingNo() {

        int a[] = {1, 2, 12, 15, 6, 8, 9, 10};
        int j = 1, s;
        Arrays.sort(a);
        // 1,2,6,8,9,10,12,15
        for (int i = 0; i <= a.length - 1; i++) {
            s = a[i];
            if (a[i] == j) {
                j++;
            } else {
                if (j < s) {
                    System.out.println(j);
                    j++;
                }
                i = i - 1;
            }
        }
    }

    @Test
    public void missingNo1() {
        int a[] = {23, 20, 32, 24, 43, 45, 40, 42};
        int j = 1, s;
        Arrays.sort(a);
        // 1,2,6,8,9,10,12,15
        for (int i = 0; i <= a.length - 1; i++) {
            s = a[i];
            if (a[i] == j) {
                j++;
            } else {
                if (j < s) {
                    System.out.println(j);
                    j++;
                }
                i = i - 1;
            }
        }
    }

    @Test
    public void get() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void get1() {
        int[] arr = {1, 3, 5, 7, 12, 14, 16, 20};
        int j = 1;
        int s;
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a);
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            s = arr[i];
            if (arr[i] == j) {
                j++;
            } else {
                if (j < s) {
                    System.out.println(j);
                    j++;
                }
                i = i - 1;
            }
        }
    }
}
