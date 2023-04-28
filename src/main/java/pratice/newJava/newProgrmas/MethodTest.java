package pratice.newJava.newProgrmas;

public class MethodTest {
    public void get1(){
        System.out.println("I am in M1 Method");
    }
    public void get2(){
        get1();
        System.out.println("I am in M2 Method");
    }
    public void get3(){
        get2();
        System.out.println("I am in M3 Method");
    }
    public void get4(){
        get3();
        System.out.println("I am in M4 Method");
    }
    public void get5(){
        get4();
        System.out.println("I am in M5 Method");
    }
    public void get6(){
        get5();
        System.out.println("I am in M6 Method");
    }

    public static void main(String[] args) {
        MethodTest method=new MethodTest();
        method.get6();
    }
}
