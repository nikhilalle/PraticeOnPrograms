package pratice.newJava.inheritance2;

public class GrandFatherConst  extends GrandFatherConst1 {
    GrandFatherConst() {
        System.out.println("I am GrandFatherConst Class ");
    }

    GrandFatherConst(int salary) {
        System.out.println("Roll No :" + salary);

    }

    GrandFatherConst(String companyGMName) {
        System.out.println("Name :" + companyGMName);
    }
}
