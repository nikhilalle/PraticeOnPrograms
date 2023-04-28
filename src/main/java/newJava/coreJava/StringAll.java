package newJava.coreJava;

import org.testng.annotations.Test;

public class StringAll {
    String name=" I am Java";
    String name1="Programmer";

    String n="i am java";
    String n1="programmer";

    @Test
    public void stringAllPro(){
        System.out.println(name + "  "+ name1);
        System.out.println(n + "  "+ n1);
        System.out.println(n.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(name1));
        System.out.println(n.equals(name));
        System.out.println(n1.equals(name1));
        System.out.println(n==name);
        System.out.println(n1==name1);
    }
    @Test
    public void replace(){
        System.out.println(name);
        System.out.println(name.replace('I','N'));
        System.out.println(name1.replace('m','1'));
        System.out.println(name.replaceAll("am","Suvi"));

    }
}
