package pratice.newJava.abstractClass;

public class Bike extends Vehicle{
    public void get(){
        System.out.println("I am in get Method Non Abstract Class");
    }
    public void set(){
        System.out.println("I am in Set Method Non Abstract Class");
    }
public void m1(){
    System.out.println("I am in M 1 Method Non Abstract Class");
}
    public static void main(String[] args) {
        Vehicle obj=new Bike();
        obj.get();
        obj.set();
        obj.m1();
    }
}
