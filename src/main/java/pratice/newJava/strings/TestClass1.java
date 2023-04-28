package pratice.newJava.strings;

public class TestClass1 {
    public static void main(String[] args) {
        String [] a={"abc","xyz","pqr"};
        String b="pqr";
        System.out.println(a[2]==b);

        String c="abc";
        String d=new String("abc");
        System.out.println(a.equals(b));
        System.out.println(c==d);


        String s="Hello";
        String v="hello";
        String s1=new String("Hello");
        String s2=new String("HELLO");
        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println(s.equals(v));
        System.out.println(s1.equals(s2));
        System.out.println(sb1.equals(sb2));


    }
}
