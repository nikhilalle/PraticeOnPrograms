package pratice.newJava.programs;

public class Inheritance {
    Inheritance(){
        System.out.println("I am  in Inheritance  Constructor ");

    }
    Inheritance(String name){
        System.out.println("Name :"+name);
    }
    Inheritance(int rollNo){
        System.out.println();
    }

    public static void main(String[] args) {
        new Inheritance();
        new Inheritance("Nikhil");
        new Inheritance(101);
    }
}
