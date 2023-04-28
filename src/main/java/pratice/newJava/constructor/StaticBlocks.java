package pratice.newJava.constructor;

public class StaticBlocks {

    /*Use the Static Keyword  it will call onces (1 time only)
    above Block is Static Addition
     */

    // Static Block
   static{int add;
        int c=20;
        int d=30;
        System.out.println("Static Block " +(add=c+d));
    }

  /*  Whenever we Create an Object of Class Instance Block call Automatically
* it will call every object creation i.e 4 object are created then 4 time instance Block will Call Automatically
*to Overcome this we can use Static Keyword so it will call onces (1 time only)
   */

// Instance Block
    {
        String name="Shri";
        int rollNo=101;
        System.out.println("Instance Block "+name);
        System.out.println("Instance Block "+rollNo);
        System.out.println("Instance Block Last Statement ");

    }



    public static void main(String[] args) {
        new StaticBlocks();
        new StaticBlocks();

    }
}
