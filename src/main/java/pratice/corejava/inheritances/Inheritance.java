package pratice.corejava.inheritances;

public class Inheritance extends Inheritance1{
    public void a(){
        System.out.println("I am Child  Class ");
        System.out.println("I am A Method");
    }
    public void  b(){
        System.out.println("I am B Method");
        System.out.println("______________");
    }

    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        obj.a();
        obj.b();
        obj.c(); // This is Parent Class
        obj.d(); // This is Parent Class
        obj.e(); // This Grand-Parent Class
        obj.f(); // This Grand-Parent Class
    }
}
