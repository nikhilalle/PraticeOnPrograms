package pratice.newJava.array;

public class ArrayConstructor {
    ArrayConstructor(int[] ar, String[] str) {
        for (int i : ar) {
            System.out.println("Roll No :" + i);
        }
        for (String s : str) {
            System.out.println("Name :" + s);
        }
    }

    ArrayConstructor(int[] ar, int[] br, String[] str) {
        for (int i : ar) {
            System.out.println("Roll No :" + i);
        }
        for (String s : str) {
            System.out.println("Name :" + s);
        }
        for (int j : br) {
            System.out.println("Marks :" + j);
        }
    }

    ArrayConstructor(String[] xy, String[] str) {
        for (String i : xy) {
            System.out.println("Name :" + i);
        }
        for (String s : str) {
            System.out.println("Sur-Name :" + s);
        }
    }

    public static void main(String[] args) {
        int[] x = {10, 20, 30, 40, 50};
        int[] y = {89, 96, 89, 98, 95};
        String[] str = {"Shri", "Nikhil", "Shruti", "Harika", "Adhira"};
        String[] str1 = {"Alle", "Boga", "Adam", "Penti", "Alle"};
        new ArrayConstructor(x, str);
        new ArrayConstructor(x, y, str);
        new ArrayConstructor(str,str1);

    }
}

