package pratice.newJava.constructor;

public class InstanceBlock {
    {
        System.out.println("Instance Block 1 ");
    }
    {
        System.out.println("Instance Block  2");
    }
/*
* Whenever we Create an Object of Class Instance Block call Automatically
* it will call every object creation i.e 4 object are created then 4 time instance Block will Call Automatically
 */
    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
    }
}
