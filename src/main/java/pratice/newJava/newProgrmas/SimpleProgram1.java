package pratice.newJava.newProgrmas;

public class SimpleProgram1 {
    int a=25;
    int b=50;
    int sum;
    int div;
    int mul;
    int sub;
    public void add(){
        sum=a+b;
        System.out.println("Sum : "+sum);
    }
    public void division(){
        div =a/b;
        System.out.println("Division : "+div);
    }
    public void multiply(){
        mul=a*b;
        System.out.println("Multiplication : "+mul);
    }
    public void sub(){
        sub=a-b;
        System.out.println("Subtraction : "+sub);
    }

    public static void main(String[] args) {
        SimpleProgram1 nv=new SimpleProgram1();
        nv.add();
        nv.division();
        nv.multiply();
        nv.sub();
    }
}
