package pratice.newJava.array;

public class ArrayInt {
    public static void main(String[] args) {
        String[] str = {"Nihil", "alle"};

        int arr[] = {12, 15, 25, 56, 65};
        System.out.println(arr.length);

        for (int j = 0; j <= 5; j++) {
            System.out.println(arr[j]);
        }

        for (int k = 0; k <= 1; k++) {
            System.out.println(str[k]);
        }

        System.out.println("_______________");
        for (int k =str.length-1; k >= 0; k--) {
            System.out.println(str[k]);
        }
        System.out.println("______________________");
        for (String st:str) {
            System.out.println(st);
        }

        }

    }
