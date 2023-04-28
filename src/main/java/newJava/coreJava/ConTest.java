package newJava.coreJava;

public class ConTest {


    ConTest() {
        System.out.println("I  in non Parameter  Constructor");
    }

    ConTest(int a) {
        System.out.println(a);
    }

    ConTest(String name) {
        System.out.println(name);

    }

    ConTest(int roll, String name) {
        System.out.println(roll + name);
    }

    ConTest(String name, int roll) {
        System.out.println(name + roll);
    }

    public void get() {
        ConTest con = new ConTest();
    }

    public static void main(String[] args) {

    }

}