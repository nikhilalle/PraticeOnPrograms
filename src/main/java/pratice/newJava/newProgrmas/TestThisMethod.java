package pratice.newJava.newProgrmas;

public class TestThisMethod {
    int a=20;
    int b=40;
    int c=70;
    int d=25;
    public void get(int a,int b){
        int sum=a+b+c;
        System.out.println("Sum Of A,B is :"+sum);
        System.out.println("_________________");
        int sumThis=this.a+b+this.c;
        System.out.println("Sum Of This Keyword A,B is :"+sumThis);
    }
    public void get(int a,int b,int c){
        int div=a/b+c;
        System.out.println("Division Of A,B,C is :"+div);
        System.out.println("_________________");
        int divThis=this.a/this.b+this.c;
      System.out.println("Division This Keyword of A,B,C :"+divThis);
    }
    public void get1(int b,int c,int d){
        int mutli=b*c*d;
        System.out.println("Multiply Of B,C ,D is :"+mutli);
        System.out.println("_________________");
        int mutliThis=this.b*this.c*this.d;
        System.out.println("Multiply This Keyword Of B,C ,D is :"+mutliThis);
    }

    public static void main(String[] args) {
        TestThisMethod obj=new TestThisMethod();
        obj.get(10,30);
        obj.get(10,30,40);
        obj.get1(30,50,70);
    }
}
