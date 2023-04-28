package pratice.corejava.allPrograms;

public class MatrixProgram {

    public void data(int a,int b)
    {
        int x =a+b;
        int y=a*b;
        int z=a-b;
        int w=a/b;

        System.out.println("Addctional :"+x);
        System.out.println("Multiplication :"+y);
        System.out.println("Substraction :"+z);
        System.out.println("Division :"+w);
        System.out.println("All Matrix Programs");
    }

    public static void main(String[] args) {
        MatrixProgram obj = new MatrixProgram();
        obj.data(10,20);
    }
}
