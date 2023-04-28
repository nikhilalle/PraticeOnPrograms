package newJava.coreJava;

public class StaticBlocks {
    int  a=10;
    String name="ABC";

   static int  b=20;
   static String surName="ABC";

   static  {
       System.out.println("-------------");
       StaticBlocks bc=new StaticBlocks();
       System.out.println("-------------");

        System.out.println(bc.a);
        System.out.println(bc.name);
    }
    static  {
        System.out.println(b);
        System.out.println(surName);
    }
  static   {
        int q=10;
        String name="XYZ";
        System.out.println(q);
        System.out.println(name);
    }


    public static void main(String[] args) {
        StaticBlocks bl=new StaticBlocks();
        new StaticBlocks();
        new StaticBlocks();
        new StaticBlocks();
        new StaticBlocks();


    }
}
