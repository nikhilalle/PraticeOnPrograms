package pratice.newJava.programs;

public class Method1 {
    int a=20;
    int b=30;
    double x=20.5;
    double y=30.5;
    double z=40.5;
    public void add(){
        System.out.println("Addiction :"+(a+b));
        System.out.println("Point Addiction :"+(x+y+z));
    }
    public void mult(){
        System.out.println("Multiply :"+(a*b));
        System.out.println("Point Mult :"+(x*y*z));
        System.out.println("All Add & Mult :"+(a+b*y+b-a*y+b/z));
    }

    public static void main(String[] args) {
        Method1 ad=new Method1();
        ad.add();
        ad.mult();
    }
}
