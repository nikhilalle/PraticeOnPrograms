package pratice.corejava.variables;

public class LocalVariable {
  LocalVariable(){
      System.out.println("I AM  IN CONSTRUCTER");
  }
    {
        System.out.println("I AM  IN block");
    }
    {
        System.out.println("I am Block 2");
    }
    {
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("sum  :"+sum);

    }

    public static void main(String[] args) {

      new LocalVariable();
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println("sum  :"+sum);

    }
}
