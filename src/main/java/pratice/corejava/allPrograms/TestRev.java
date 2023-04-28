package pratice.corejava.allPrograms;

public class TestRev {
    public static void main(String[] args) {
        String str="Shriniwas Alle";
        String rvs=" ";
        char ch;
        System.out.println(str);
        System.out.println(str.length());
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rvs=ch+rvs;
        }
        System.out.println("Reverse :- "+rvs);
    }
}
