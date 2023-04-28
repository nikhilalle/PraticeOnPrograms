package pratice.corejava.allPrograms;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Shriniwas";
        String str2 = "Shriniwas";
        String str3 = "Shri";
        String str4 = "Shri";
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println("-----------------------");
        System.out.println(str1==str2);

        System.out.println("-----------");
        System.out.println(str1.equals(str2));
        System.out.println("-----------------------");
        System.out.println(str1.equals(str3));

        System.out.println("-------- Next---------------");
        System.out.println(str4==str3);


        System.out.println(str3.equals(str4));

    }
}
