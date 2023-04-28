package newJava.coreJava;

public class Methods {


public void get(){
    int a=20;
    int b=20;
    int sum;
    sum=a+b;
    System.out.println(sum);
}
    public static void set(){
        int a=30;
        int b=30;
        int sum;
        sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int sum;
        sum=a+b;
        System.out.println(sum);
        Methods pooja=new Methods();
        pooja.get();
        set();
    }
}
