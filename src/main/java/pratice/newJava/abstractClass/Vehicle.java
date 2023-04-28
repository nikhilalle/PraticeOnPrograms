package pratice.newJava.abstractClass;

public abstract class Vehicle {
    Vehicle(){
        System.out.println("I am in Non Abstract Class Vehicle Constructor");
    }
    public void m2(){
        System.out.println("I am in M2  Method Abstract Class");
    }
    public abstract void get();
    public abstract void set();
    public abstract void m1();

    public static void main(String[] args) {

    }
}
