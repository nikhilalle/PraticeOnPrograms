package pratice.newJava.newProgrmas;

public class Methods {
    public void get1(){
        System.out.println("Im in 1 st Method");
    }
    public void get2(){
        get1();
        System.out.println("Im in 2nd Method");
    }
    public void get3(){
        get2();
        System.out.println("Im in 3rd Method");
    }
    public void get4(){
        get3();
        System.out.println("Im in 4th Method");
    }

    public static void main(String[] args) {
        Methods obj=new Methods();
        obj.get4();
    }
}
