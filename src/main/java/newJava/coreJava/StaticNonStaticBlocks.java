package newJava.coreJava;

public class StaticNonStaticBlocks {

    StaticNonStaticBlocks(){
        System.out.println("Constructor");
    }
    static  {
        System.out.println("Static Block");
    }
    static  {
        System.out.println("Static Block 2");
    }
    {
        System.out.println("Non Static Block ");
    }
    {
        System.out.println("Non Static Block   2  ");
    }
    public static void main(String[] args) {
        // StaticNonStaticBlocks bl   =   new StaticNonStaticBlocks();
        // Reference                      Object Creation
        new StaticNonStaticBlocks();
        System.out.println("_------------");
        new StaticNonStaticBlocks();
    }
}
