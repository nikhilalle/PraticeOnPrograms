package newJava.coreJava;

import org.testng.annotations.Test;

public class StringEqual {
    String name = "Pooja";
    String surname = "Dhavel";
    String name1 = "Suvi";
    String surname1 = "Wasnik";
    String name2 = "Kiran";
    String surname2 = "Javalge";
    @Test
    public void stringCheck(){
        System.out.println(name+"  "+surname);
        System.out.println(name1+"  "+surname1);
        System.out.println(name2+"  "+surname2);
    }
    @Test
    public void stringCheck1(){
        System.out.println(name.concat(" "+surname));
        System.out.println(name1.concat(" "+surname1));
        System.out.println(name2.concat(" "+surname2));

    }


}
