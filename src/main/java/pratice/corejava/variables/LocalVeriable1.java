package pratice.corejava.variables;

public class LocalVeriable1 {
    public void get() {
        int a = 10;
        int b = 20;
        String name = "Sneha";
        System.out.println("This is LocalVerible Method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
    }

    public void set() {
        System.out.println("This is Set Method");
        // System.out.println(a);
        //  System.out.println(b);
        // System.out.println(name);
    }

    public static void main(String[] args) {
        LocalVeriable1 veriable=new LocalVeriable1();

        veriable.get();
        veriable.set();

    }
}
