package pratice.newJava.strings;

public class StringTest1 {
    public static void main(String[] args) {
        String str = "Nikhilesh";
        String str1 = " Alle";
        str = str.concat(str1);
        System.out.println(str);

        StringBuffer str3 = new StringBuffer("Shri");
        String str4 = " Niwas";
        str3.append(str4);
        System.out.println(str3);


        StringBuffer str5=new StringBuffer("Nikhilesh");
        System.out.println(str5.append(str1));

        char [] ch={'N','I','K','H','H','I','L'};
        String [] st={"Nikhil","Alle"};
        System.out.println(ch.length);
        System.out.println(st.length);


    }
}
