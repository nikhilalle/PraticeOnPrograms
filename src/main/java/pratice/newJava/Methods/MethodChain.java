package pratice.newJava.Methods;

public class MethodChain {

    public void m1(){

        System.out.println("I am in M1 ");
        m2();
    }
    public void m2(){

        System.out.println("I am in M2 ");
        m3();
    }
    public void m3(){

        System.out.println("I am in M3 ");
        m4();
    }
    public void m4(){

        System.out.println("I am in M4 ");
        m5();
    }
    public void m5(){

        System.out.println("I am in M5 ");
    }
    public void m6(){
        m1();
        System.out.println("I am in M6 ");
    }

    public static void main(String[] args) {
        MethodChain obj=new MethodChain();
        obj.m6();

    }
}
