package newJava.coreJava;

public class TestConstructor {

    public TestConstructor(){
        System.out.println("I  non Para am In Constructor");
    }
    public TestConstructor(int a, int b){
        System.out.println("I  Parameter am In Constructor");
        System.out.println("PARA    "+a);
        System.out.println("PARA    "+b);
    }
    public TestConstructor(int a, int b,int c){
        System.out.println("I  Parameter am In Constructor");
        System.out.println("PARA    "+a);
        System.out.println("PARA    "+b);
        System.out.println("PARA    "+c);
    }
    public static void main(String[] args) {
        TestConstructor test=new TestConstructor(12,33);
        new TestConstructor();
        new TestConstructor(20,20);
        new TestConstructor(12,54,43);
    }
}


