package pratice.corejava.classVariable;

public class ThisFunction {
    int  a=20;
    int b=30;
    int c=50;
    public void additional(int a,int b,int c)
    {
        int z=a+b+c;
        System.out.println("Additional :"+z);
        System.out.println("---------------------");
        int x=this.a+this.b+this.c;
        System.out.println("This Program Additional :"+x);
    }
    public void Multiplication(int a,int b,int c)
    {
        int  y=a*b*c;
        System.out.println("Multiplication :"+y);
        System.out.println("---------------------");
        int z=this.a*this.b*this.c;
        System.out.println("This Program Multiplication :"+z);
    }

    public static void main(String[] args) {
        ThisFunction obj=new ThisFunction();
        obj.additional(100,200,300);
        System.out.println("---------------------");
        obj.Multiplication(500,600,700);

    }
}
