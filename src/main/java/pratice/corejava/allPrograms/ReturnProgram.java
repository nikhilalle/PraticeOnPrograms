package pratice.corejava.allPrograms;

public class ReturnProgram {
    public static String get(String name)
    {
        return name;
    }
    public static int data(int roll)
    {
        return roll;
    }

    public static void main(String[] args) {
        new ReturnProgram();
        String b = ReturnProgram.get("Nikhil");
        System.out.println("Return Type Programs");
        System.out.println(b);
        int c = ReturnProgram.data(25);
        System.out.println(c);

    }
}
