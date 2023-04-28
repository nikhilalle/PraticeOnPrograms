package pratice.newJava.strings;

import java.util.Locale;

public class StringAllMethod {
    public static void main(String[] args) {
        String str1="shruti";
        String str2="NIKHILESH";
        String str3="Shriniwas";
        String str4="Alle";
        String str5="NIKHILESH";
        String str6="Nikhilesh";

        System.out.println(str1+"  "+str2+"   "+str3+"    "+str4+"   "+str5+"  "+str6)  ;

        System.out.println("Length of String :"+str1.length()+" "+str2.length()+" "+str3.length()+" "+str4.length()+" "+str5.length());
        System.out.println("NIKHILESH Lower-Case :"+str2.toLowerCase(Locale.ROOT));

        System.out.println("shruti Upepr-case :"+str1.toUpperCase(Locale.ROOT));
        System.out.println("Change Char  I to E :"+str2.replace('I','E'));
        System.out.println("Start N end with L "+str2.substring(0,5));  // Value in Index No.Start and End
        System.out.println("Adding String  "+str2.concat(" "+str4));
        System.out.println("Start with Check :"+str1.startsWith("shr"));
        System.out.println("Start with Check :"+str2.startsWith("NIK"));
        System.out.println("End with Check :"+str3.endsWith("niwas"));
        System.out.println("End with Check :"+str4.endsWith("le"));
        System.out.println("Start with Check :"+str2.startsWith("nIK"));
        System.out.println("Append Add Sur name ");

        System.out.println("-----------Append Start--------");
        StringBuffer details=new StringBuffer("  Nikhiesh   ");
        System.out.println(details.length());
        System.out.println(details.append("  Anil  "));
        System.out.println(details.append("  Alle  "));
        System.out.println(details.length());

        StringBuffer details2=new StringBuffer("  Shriniwas   ");
        System.out.println(details2.length());
        details2.append("   Nagesh");
        System.out.println(details2.append("    Alle"));
        System.out.println(details2.length());

        System.out.println("-----------Append  Ends-------");







        //  String str5="NIKHILESH";
       // String str6="Nikhilesh";
        System.out.println("-----------Check Equal--------");
        System.out.println(str2.equals(str5));  // True
        System.out.println(str2==str5);   // True

        System.out.println(str5.equals(str6));  // False
        System.out.println(str5==str6);     // False





    }
}
