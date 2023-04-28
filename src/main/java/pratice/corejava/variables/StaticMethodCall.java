package pratice.corejava.variables;

public class StaticMethodCall {
    public static void  get(){
        System.out.println("I Am in Static Method -1 ");

    }
    public static void  get1(){
        System.out.println("I Am in Static Method -2 ");

    }
    public static void  get2(){
        System.out.println("I Am in Static Method -3 ");

    }
    public void get3(){
        System.out.println("I Am in Non-Static Method -4 ");
    }


    public static void main(String[] args) {
       StaticMethodCall obj= new StaticMethodCall();
        get(); // With Creating Obj Directly Call
        get1();
        get2();
        obj.get3(); // By Using Obj Creation
    }
}
