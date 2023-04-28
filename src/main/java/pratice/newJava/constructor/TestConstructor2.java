package pratice.newJava.constructor;

public class TestConstructor2 {
    int sum;
    int add;
    {
        System.out.println("Instance Block   1  ");
        int c=20;
        int d=30;
        System.out.println("Instance Block " +(add=c+d));
    }
    TestConstructor2(int a,int b){
        this("Nikhil",9001);
        System.out.println(sum=a+b);
    }
    {
        System.out.println("Instance Block 2  ");
        String name="Shri";
        int rollNo=101;
        System.out.println("Instance Block "+name);
        System.out.println("Instance Block "+rollNo);
    }

    TestConstructor2(String name,int rollNo){

        System.out.println(name);
        System.out.println(rollNo);
    }
    TestConstructor2(){
        this(65,98);
        System.out.println("No Parameters");
    }

    public static void main(String[] args) {
        new TestConstructor2();
        new TestConstructor2();
        new TestConstructor("Shruti",100);
    }
}

