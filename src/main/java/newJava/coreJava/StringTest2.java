package newJava.coreJava;

import org.testng.annotations.Test;

public class StringTest2 {
    String name = "pooja";
    String name1 = "suvi";
    String name2 = "kiran";
    String Sname = "POOJA DHAVEl";
    String Sname1 = "SUVI WASNIK";
    String Sname2 = "KIRAN JAVALGE";

    String Kname2 = "KiRan jAvAlge";

    @Test
    public void Case(){
        System.out.println("Lower ");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        System.out.println("Upper ");
        System.out.println(Sname);
        System.out.println(Sname1);
        System.out.println(Sname2);
    }

    @Test
    public void lowerCase(){
        System.out.println("Lower Case");
        System.out.println(Sname.toLowerCase());
        System.out.println(Sname1.toLowerCase());
        System.out.println(Sname2.toLowerCase());
    }
    @Test
    public void UpperCase(){
        System.out.println("Upper Case");
        System.out.println(name.toUpperCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toUpperCase());

        System.out.println("---------------------");
        System.out.println(Kname2.toUpperCase());

        System.out.println("---------------------");
        System.out.println(Kname2.toLowerCase());

    }


}
