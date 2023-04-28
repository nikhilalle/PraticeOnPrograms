package newJava.coreJava;

import org.testng.annotations.Test;

public class StringTest1 {
    String name = "Pooja";
    String name1 = "Suvi";
    String name2 = "Kiran";

    String Sname = "Pooja";
    String Sname1 = "Suvi";
    String Sname2 = "Kiran";

    String Kname = "PoOjA";
    String Kname1 = "SUvI";
    String Kname2 = "KIrAn";
@Test
    public void stringCheck(){
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
    }
@Test
    public void check(){
    System.out.println(name==Sname);
    System.out.println(name1==Sname1);
    System.out.println(name2==Sname2);
    System.out.println(name2==Sname1);

    System.out.println(name==Sname);
}

    @Test
    public void check1(){
        System.out.println(name.equals(Sname));
        System.out.println(name1.equals(Sname1));
        System.out.println(name2.equals(Sname2));

        System.out.println(name1.equals(Sname));
    }

    @Test
    public void check2(){
        System.out.println(Sname.equals(Kname));
        System.out.println(Sname1.equals(Kname1));
        System.out.println(Sname2.equals(Kname2));

        System.out.println("---------------------");
        System.out.println(Sname==Kname);
        System.out.println(Sname1==Kname1);
        System.out.println(Sname2==Kname2);

    }


}
