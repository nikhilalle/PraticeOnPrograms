package pratice.corejava.Blocks;

public class StaticBlock2 {
    StaticBlock2(){
        System.out.println("i am  1st in Constructor");
    }
    StaticBlock2(int a){
        System.out.println("i am  2nd  in Constructor");
        System.out.println(a);
    }
    static {
        System.out.println("i am  1st in Static Block");
        // this is called at time of Compilation and it will call only once
            }
    {
        System.out.println("i am  Instance  Block");
        // this is called Multiple time Whenever Object is Created it will Called Default
    }

    public static void main(String[] args) {
        new StaticBlock2();
        new StaticBlock2(34);
    }
}
