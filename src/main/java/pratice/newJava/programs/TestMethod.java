package pratice.newJava.programs;

public class TestMethod {
    int a=20;
    int b=40;
    int c=70;
    int d=25;
    public void get(int a,int b){
        int sum=a+b+c;
        System.out.println("Sum Of A,B is :"+sum);
    }
    public void get(int a,int b,int c){
        int div=a/b+c;
        System.out.println("Division Of A,B,C is :"+div);
    }
    public void get1(int b,int c,int d){
        int mutli=b*c*d;
        System.out.println("Multiply Of B,C ,D is :"+mutli);
    }

    public static void main(String[] args) {
        TestMethod obj=new TestMethod();
        obj.get(10,30);
        obj.get(10,30,40);
        obj.get1(30,50,70);
    }
}
