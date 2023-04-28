package pratice.newJava.strings;

public class String1 {
    public static void main(String[] args) {


        String[] str = {"Shri", "Nikhil", "Anil"};
        char[] ch = {'N', 'I', 'K', 'H', 'I', 'L'};
        for (String ar:str)

        {
            System.out.println(ar);
        }

        for (int ab:ch)

        {
            System.out.println(ab);
        }
        String str8= "Shriniwas-Alle";
        System.out.println(str8);
        System.out.println(str8.replaceAll("-", " Nagesh "));
    }
}
