package pratice.newJava.constructor;

public class TestConstructor {
    int sum;
    TestConstructor(int a,int b){
        System.out.println(sum=a+b);
    }
    TestConstructor(String name,int rollNo){
        this(24,78);
        System.out.println(name);
        System.out.println(rollNo);
    }
    TestConstructor(){
        this("Shri",101);
        System.out.println(this);
    }

    public static void main(String[] args) {
        new TestConstructor();
    }
}
