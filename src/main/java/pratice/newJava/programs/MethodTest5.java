package pratice.newJava.programs;

public class MethodTest5 {
    int java(int a, int b) {
        return a + b;
    }
     static int java(int c, double d) {
        return (int) (c + d);
    }
    double java(double w, int o) {
        return w + o;
    }
     static double java(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        MethodTest5 obj = new MethodTest5();
        int r=obj.java(25, 50);
        System.out.println(r);
       double d=obj.java(500, 10);
        System.out.println(d);
       double m= MethodTest5.java(50, 600.0);
        System.out.println(m);
        double y=java(1250, 1350.0);
        System.out.println(y);
    }
}
