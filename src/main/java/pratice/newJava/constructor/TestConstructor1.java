package pratice.newJava.constructor;

public class TestConstructor1 {
    int sum;
    {
        int a=20;
        int b=30;
    }
    TestConstructor1(int a,int b){
        this("Nikhil",9001);
        System.out.println(sum=a+b);
    }
    {
        String name="Shri";
        int rollNo=101;
    }

    TestConstructor1(String name,int rollNo){

        System.out.println(name);
        System.out.println(rollNo);
    }
    TestConstructor1(){
        this(65,98);
        System.out.println("No Para");
    }


    public static void main(String[] args) {
        new TestConstructor1();
    }
}
