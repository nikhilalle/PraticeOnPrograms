package pratice.corejava.variables;


public class Test1 {
    public static void main(String[] args) {
//        NonStatic obj=new NonStatic();
//        System.out.println("this is coming from Non Static - Nikhilesh");
//        System.out.println("this is coming from Non Static - Shriniwas");
//        obj.data();

        String str = "Shriniwas";

        // Using StringBulider
        StringBuilder str1 = new StringBuilder(str);
        System.out.println(str1.reverse());

        // Using StringBuffer
        StringBuffer str2 = new StringBuffer(str);
        System.out.println(str2.reverse());

        System.out.println("-----------------------");

        // String SCP Immutable
        String str12 = "Shri";
        str12.concat("Alle");
        System.out.println(str1);

        // String object Immutable
        String str4 = new String("Hello");
        str4.concat("World");
        System.out.println(str4);

    }



}
