package pratice.newJava.strings;

public class StringData {
    public static void main(String[] args) {
        String str="NIKHILESH";
        String str1="nikhilesh-alle";
        System.out.println("Length of Nikhilesh :"+str.length());
        System.out.println("Lower Case Nikhilesh :"+str.toLowerCase());
        System.out.println("Upper Case Nikhilesh :"+str1.toUpperCase());
        System.out.println("Length of Nikhilesh :"+str1.length());
        System.out.println();

        char [] ch={'N','I','K','H','H','I','L'};
        String [] st={"Nikhil","Alle"};
        System.out.println(ch.length);
        System.out.println(st.length);

        String str2="Shri";
        String str3="Shri";
        String str4="Nikhil";
        String str5="Nikhil";
        System.out.println("Equal Check : "+str2.equals(str3)); // TRUE
        System.out.println("Equal Check : "+str2.equals(str4)); // FALSE
        System.out.println("Equal Check : "+str4.equals(str5)); // TRUE
        System.out.println("Equal Check : "+str1.equals(str4)); // FALSE
        System.out.println("Equal Check of Str 2 & STR 3 :"+(str2==str3)); // TRUE
        System.out.println("Equal Check of Str 4 & STR 5 :"+(str4==str5)); // TRUE
        System.out.println("Equal Check of Str 2 & STR 3 :"+(str2==str4)); // FALSE
        System.out.println("Equal Check of Str 2 & STR 3 :"+(str3==str5)); // FALSE
    }
}
