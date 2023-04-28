package pratice.newJava.inheritance2;

public class Test extends Interface {
    void show() {
        System.out.println("I am In Test JAVA Class");
    }

    public static void main(String[] args) {
        Test ts = new Test();
        ts.show();
    }
}
