package pratice.corejava.allPrograms;

public class StringTestRev {
    public static void main(String[] args) {

    String str ="Nikhilesh Alle";
    String st=" ";
    char ch;
        System.out.println(str);
        System.out.println(str.length());

        for(int i=0;i<=str.length();i++){
            ch=str.charAt(i);
            st=ch+st;
        }
        System.out.println(st);
}}
