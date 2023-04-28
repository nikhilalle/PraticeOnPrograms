package newJava.coreJava;

public class Blocks {
    int  a=10;
    String name="ABC";

    {
        System.out.println(a);
        System.out.println(name);
    }

    {
        int q=10;
        String name="XYZ";
        System.out.println(q);
        System.out.println(name);
    }

    {
        char ch='Z';
        int n=100;
        System.out.println(ch);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Blocks bl=new Blocks();
        System.out.println("-----------------");
        new Blocks();
        System.out.println("-----------------");
        new Blocks();

    }
}
