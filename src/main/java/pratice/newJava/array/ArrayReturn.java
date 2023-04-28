package pratice.newJava.array;

public class ArrayReturn {

    public static int[] ArrayProgram() {
        int ar[] = {10, 20, 30, 40, 50};
        return ar;
    }
    public static void main(String[] args) {

        int a[] = ArrayProgram();
        for (int i = 0; i <= a.length; i++)
            System.out.println(a[i]);

    }
}
