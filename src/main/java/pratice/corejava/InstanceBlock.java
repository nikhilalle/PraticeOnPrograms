package pratice.corejava;

public class InstanceBlock {
    InstanceBlock(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Inializer 2 Block");
    }

    {
        System.out.println("Inializer 1 Block ");
    }
    public static void main(String[] args) {

        InstanceBlock str=new InstanceBlock();
        System.out.println("I am in  Main Method");
        InstanceBlock str1=new InstanceBlock();

    }
    static {
        System.out.println("Static Block");
    }


}
