package newJava.coreJava;

public class Variable {

    // Instance Variable
    int x=40;
    int y=70;
    static  int sum;
    // Static Variable
    static  int s=30;
    static  int t=60;
    public  void add()           {  //Method Open
// Local  Variable
        int a=10;
        int b=20;

        sum=a+b;


        // Static      Int a=10;    Not Allow
        //  Static     Int b=20;    Not Allow

        sum=x+y;  // Instance    Variable
        sum=s+t;     //Static Variable
    } // Method Close

    public void division () {
        int i=10;
        int j=20;
        int div;
        div=i/j;
    }
    public  static void Subtraction () {
        int i=10;
        int j=20;
        int sub;
        sub=i-j;
        Variable nik=new Variable();
        sum=nik.x+nik.y;   //Instance    Variable
        //  sum=x+y;
        sum=s+t;     //Static Variable

    }


    // Instance Variable
    int x1=40;
    int y1=70;
    int sum1;

    // Static Variable
    static  int s1=30;
    static  int t1=60;
    int sum2;


}
