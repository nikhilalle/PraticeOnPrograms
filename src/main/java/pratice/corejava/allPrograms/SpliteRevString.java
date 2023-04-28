package pratice.corejava.allPrograms;

public class SpliteRevString {
    public static void main(String[] args) {
        String str=new String("MY Name is Shriniwas ");

        System.out.println(str);
        System.out.println(str.length());
        String [] st=str.split(" ");
        System.out.println(st.length);
        for (int i=st.length-1;i>=0;i--){
            System.out.print(" "+st[i]);
        }
       System.out.println();
    }
}
