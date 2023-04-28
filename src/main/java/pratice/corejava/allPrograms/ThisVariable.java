package pratice.corejava.allPrograms;

public class ThisVariable {
    int a=100;
    int b=200;
    public void data(int a,int b)
    {

        int x =a+b;
        int y=a*b;
        int z=a-b;
        int w=a/b;

        System.out.println("Addctional :"+x);
        System.out.println("Multiplication :"+y);
        System.out.println("Substraction :"+z);
        System.out.println(" Division :"+w);

        // this Key-Word Using
        System.out.println("All This-KeyWord Programs");
        int m =this.a+this.b;
        int n=this.a*this.b;
        int o=this.a-this.b;
        int p=this.a/this.b;
        System.out.println("Addctional :"+m);
        System.out.println("Multiplication :"+n);
        System.out.println("Substraction :"+o);
        System.out.println("Division :"+p);
    }
    public static void main(String[] args) {
        ThisVariable obj = new ThisVariable();
        obj.data(10,20);
    }
}
