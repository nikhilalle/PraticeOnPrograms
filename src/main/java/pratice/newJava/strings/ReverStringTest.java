package pratice.newJava.strings;

import org.testng.annotations.Test;

public class ReverStringTest {
    public static void main(String[] args) {

        String str = new String("My name is Nikhilesh Alle I am from Solapur");
        System.out.println(str.length());
        String rvs = " ";
        char ch;
        System.out.println(str);
        String[] st = str.split(" ");
        System.out.println(st.length);
        for (int j = st.length - 1; j >= 0; j--) {

            System.out.print("-" + st[j]);
        }
        System.out.println();


        System.out.println("By Using Char Array");

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);

            rvs = ch + rvs;

        }
        System.out.println("The reverse string is:" + rvs);

    }

    @Test
    public void get(){
        String str = "My name is Nikhilesh Alle I am from Solapur";

        System.out.println(str);
        String[] st = str.split(" ");
        System.out.println(st.length);
        for (int j = st.length - 1; j >= 0; j--) {

            System.out.print("-" + st[j]);
        }
        System.out.println();
    }


}
