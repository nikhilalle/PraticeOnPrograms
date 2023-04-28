package pratice.newJava.strings;

public class TestString {


        public static void main(String[] args) {
            String str= "Hello World";
            String rvs= "  ";
            char ch;

            System.out.println(str.length());
            for(int i=0; i<str.length(); i++){

                ch= str.charAt(i);
                rvs= ch+rvs;
            }

            System.out.println("The reverse String is :  "        +rvs);
        }

    }
