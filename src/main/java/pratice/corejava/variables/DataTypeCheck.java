package pratice.corejava.variables;

public class DataTypeCheck {
        static int rollNumber;
        static byte by;
        static boolean b;
        static char chr;
        static float fl;
    // Using Non Static Veriable
        double dl;

        static String st;
    public static void main(String[] args) {
        DataTypeCheck check=new DataTypeCheck();

        System.out.println("Default Value of Integer "+rollNumber);
        System.out.println("Default Value of Byte "+by);
        System.out.println("Default Value of Boolean "+b);
        System.out.println("Default Value of Char "+chr);
        System.out.println("Default Value of Float "+fl);
        // Using Non Static Veriable
        System.out.println("Default Value of Double "+check.dl);

        System.out.println("Default Value of String "+st);

    }
}
