package pratice.newJava.interfaceJava;

public class Bike {
    static String name ="Nikhil";
    void m1(){
        System.out.println("I am in Bike M1 Method");
    }
    void m2(){
        System.out.println("I am in Bike M2 Method");
    }

    public static void main(String[] args) {
        Bike br=new Bike();
        br.m1();
        br.m2();
    }
}
