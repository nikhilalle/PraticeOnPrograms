package pratice.corejava;

public class SequenceTest {
    static {
        System.out.println("1st Static Block..");
    }

    static {
        System.out.println("2nd Static Block..");
    }

    {
        System.out.println("1st Instance Blocks");
    }
    {
        System.out.println("2rd Instance Blocks");
    }
    static {
        System.out.println("3rd Static Block..");
    }

    SequenceTest() {
        System.out.println("0-args Constructor");
    }

    SequenceTest(int rollNo) {
        System.out.println("1-args Constructor");
    }

    public static void main(String[] args) {
        new SequenceTest();
        new SequenceTest(10);
    }

}
