package pratice.corejava.Blocks;

public class Blocks2 {
    String name="Shri";
    Blocks2(){
        System.out.println("I am 1st in Constructor");
    }
    Blocks2(int a){
        System.out.println("I am 2nd in Constructor");
        System.out.println(a);
    }
    {
        System.out.println("I am in Instance Block");
        System.out.println(name);
    }
    {
        System.out.println("I am in 2nd Instance Block");
        System.out.println(name);
    }
    public static void main(String[] args) {
        new Blocks2();
        new Blocks2(34);
        new Blocks2();
    }
}
