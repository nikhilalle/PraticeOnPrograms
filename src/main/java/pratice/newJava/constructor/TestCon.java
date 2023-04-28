package pratice.newJava.constructor;

public class TestCon {
    TestCon(){
        System.out.println(" I am in  Zero para constructor");
    }


TestCon(int a){
        this();
    a=200;
    System.out.println(" I am in  one  para constructor");
    System.out.println("Variable value is A : "+a);
    System.out.println("-------------------------");

}
    TestCon(String name){
        this(395);
        name="Nikhilesh";
        System.out.println(" I am in  one para constructor");
        System.out.println("Name : "+name);

    }

    public static void main(String[] args) {
        new TestCon();
        new  TestCon(234);
        new TestCon("Shri");
    }
}