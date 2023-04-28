package pratice.newJava.programs;

public class StringReverse {


    public static void main(String[] args) {
        String  st="Shriniwas";
        char ch;
        String ab="  ";
        System.out.println("Name :- "+st);
        System.out.println("Leaght of Name : "+st.length());
        for (int i=0;i<st.length();i++){
            ch=st.charAt(i);
            ab=ch+ab;
        }
        System.out.println("Reverse Oder :"+ab);
    }
}
