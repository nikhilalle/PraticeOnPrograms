package newJava.coreJava;

public class MethodTest {
int a=40;
  static int b=40;
    public void get(int a, int b){
        int sum;
        sum=this.a+this.b;
        System.out.println(sum);
        sum=a+b;
        System.out.println(sum);
        a=10;
        b=10;
        sum=a+b;
        System.out.println(sum);

    }
    public  void set(int a, int b) {
        int sum;
        sum=a+b;
        System.out.println(sum);
        a = 10;
        b = 10;
        sum = a + b;
        System.out.println(sum);

        sum = this.a + this.b;
        System.out.println(sum);
    }
    public void let(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println(sum);
        sum=this.a+ this.b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        MethodTest  obj=new MethodTest();
        //obj.get(20,20);
        //obj. set(30,30);
        obj.let(70,70);
        obj.let(50,50);
        obj.let(60,60);


    }
}
