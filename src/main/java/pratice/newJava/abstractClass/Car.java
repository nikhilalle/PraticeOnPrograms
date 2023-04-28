package pratice.newJava.abstractClass;

public class Car extends Vehicle{
    public void cycle(){
        System.out.println("I am in   Car   Cycle Method Non Abstract Class");
    }
    public void get(){
        System.out.println("I am in  Car get Method Non Abstract Class");
    }
    public void set(){
        System.out.println("I am in  Car Set Method Non Abstract Class");
    }
    public void m1(){
        System.out.println("I am in  Car  M 1 Method Non Abstract Class");
    }

    public static void main(String[] args) {
        Car cr=new Car();
        cr.get();
        cr.set();
        cr.m1();
        cr.cycle();
        System.out.println("______________");
        Vehicle var=new Bike();
        var.get();
        var.set();
        var.m1();
        System.out.println("______________");
        Vehicle var1=new Car();
        var1.m2();
        var1.m1();
        var1.set();
        var1.get();

    }
}
