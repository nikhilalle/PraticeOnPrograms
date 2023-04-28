package pratice.newJava.interfaceExams;

public abstract class Vehicle {
    abstract void colour();
    abstract void type();
    abstract void price();
    abstract void  start();
    public void detail(){
        System.out.println("I am in Details Method in Vehicle Class");

    }
    Vehicle(){
        System.out.println("I am in Vehicle Class Constructor");
    }



}
