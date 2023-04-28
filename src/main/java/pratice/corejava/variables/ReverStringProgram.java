package pratice.corejava.variables;

public class ReverStringProgram {
    public static void main(String[] args) {


        String name = "Shriniwas";
        String rev=null;
        int len=name.length();
        System.out.println(name.length());
        for (int k = len-1; k >= 0; k--) {
rev=rev+name.charAt(k);

        }
        System.out.println("Reverse of " +name+ "  is  "+rev);

    }
}
