package newJava.coreJava;

public class MethodChain {
    static MethodChain mn;

    public void a() {

        d();
        System.out.println(" A Method Calling ");
    }

    public static void b() {
        System.out.println(" B Method Calling ");
        MethodChain mn = new MethodChain();
        mn.a();
    }

    public void c() {

        System.out.println(" C Method Calling ");
    }

    public static void d() {

        System.out.println(" D Method Calling ");

        mn.c();

    }

    public static void main(String[] args) {
        b();
    }
}
