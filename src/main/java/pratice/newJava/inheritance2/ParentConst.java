package pratice.newJava.inheritance2;

public class ParentConst extends GrandFatherConst {
    ParentConst() {
        System.out.println("I am Parent Class ");
    }

    ParentConst(int gateNo) {
        System.out.println("Roll No :" +gateNo);

    }

    ParentConst(String companyName) {
        System.out.println("Name :" + companyName);
    }
}
