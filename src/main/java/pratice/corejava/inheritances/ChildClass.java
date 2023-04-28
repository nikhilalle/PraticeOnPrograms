package pratice.corejava.inheritances;

public class ChildClass extends ParentClass{

    public  void m1(){
        System.out.println("I am In Child  M1 Method ");
    }
    public  void m2(){
        System.out.println("I am In Child  M2 Method ");

    }
    public static void main(String[] args) {
        ChildClass ch=new ChildClass();
        ch.m1();
        ch.m2();
        ch.s1();
        ch.s2();
        new ParentClass("Nikhilesh");
        new ParentClass(101,"TCS");

    }
}
