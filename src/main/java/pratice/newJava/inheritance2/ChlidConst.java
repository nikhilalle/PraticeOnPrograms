package pratice.newJava.inheritance2;

public class ChlidConst extends ParentConst{
    ChlidConst() {
        System.out.println("I am Child Class ");
    }

    ChlidConst(int roll) {
        System.out.println("Roll No :" + roll);

    }

    ChlidConst(String name) {
        System.out.println("Name :" + name);
    }

    public static void main(String[] args) {
        new ChlidConst();
        new ChlidConst(101);
        new ChlidConst("Nikhil");
        new ParentConst();
        new ParentConst(10);
        new ParentConst("TCS");
        new GrandFatherConst();
        new GrandFatherConst(10000);
        new GrandFatherConst("Shri");
        new GrandFatherConst1();
        new GrandFatherConst1(20);
        new GrandFatherConst1("Rohit");
    }
}
