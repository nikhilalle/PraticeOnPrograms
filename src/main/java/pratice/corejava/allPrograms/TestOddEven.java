package pratice.corejava.allPrograms;

public class TestOddEven {
    TestOddEven(int a){
        System.out.println(a);

        if (a%2==0){
            System.out.println("Even No");
        }

        else {
            System.out.println("odd no");
        }
    }
    public static void main(String[] args) {
     new TestOddEven(20);
     new TestOddEven(45);
     new TestOddEven(12);
     new TestOddEven(32);
     new TestOddEven(250);


    }
}
