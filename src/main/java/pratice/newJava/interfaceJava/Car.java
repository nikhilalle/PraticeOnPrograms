package pratice.newJava.interfaceJava;

public class Car {
    static String name ="Nikhil";
    void m1(){
        System.out.println("I am in Car M1 Method");
    }
    void m2(){
       System.out.println("I am in Car M2 Method");
    }

    public static void main(String[] args) {
        Car cr=new Car();
        cr.m1();
        cr.m2();
    }
}
