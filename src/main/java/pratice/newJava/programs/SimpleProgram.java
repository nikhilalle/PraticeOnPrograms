package pratice.newJava.programs;

public class SimpleProgram {
    public void get(){
        System.out.println("I am New World");
    }
    public void set(){
        System.out.println("Welcome to My World");
    }

    public static void main(String[] args) {
        SimpleProgram obj=new SimpleProgram();
        obj.get();
        obj.set();
    }
}
