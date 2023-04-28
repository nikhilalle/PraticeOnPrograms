package pratice.corejava.Blocks;

public class Blocks1 {
    int a;
    int roll;
    String name;
    {
        a=20;
        int roll=12;
        String name="Shri";
    }
    {
        System.out.println("I am in Block");
        System.out.println("A :"+a);
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
      new Blocks1();
    }
}
