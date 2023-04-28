package pratice.corejava.Blocks;

public class Blocks3 {
   static int a;// Static Instance Veriables
    static String name="Nikhil";
    String nameSur="Alle";
    static {
        System.out.println("i am  Static Block");
    }
    Blocks3(){
        System.out.println("i am  1st in Constructor");
    }
    Blocks3(int x,String n){
        System.out.println("i am  Parameter Constructor");
        System.out.println(x);
        System.out.println(n);
    }
    static {
        a=50;

        System.out.println("i am 2nd Static Block");
        System.out.println(a);
        System.out.println(name);
       // System.out.println(nameSur); We can not Use Non-Static Variable in Static Block

    }
    {
        System.out.println(name); // We Can use Static Instance Variable In Instance Block
        System.out.println(nameSur); // We Can use Non-Static Instance Variable In Instance Block
    }

    public static void main(String[] args) {
        new Blocks3();
        new Blocks3(24,"Nikhil");
    }
}
