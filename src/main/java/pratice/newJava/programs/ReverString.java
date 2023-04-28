package pratice.newJava.programs;

public class ReverString {
   public static void main(String[] args) {
        String str="Nikhilesh";
        String rvs=" ";
        char ch;

        System.out.println("Name :"+str);

        System.out.println(str.length());

        for (int i=0;i<str.length();i++)

        {
            ch= str.charAt(i);

            rvs = ch+ rvs;
                    }
       System.out.println("The reverse string is:"   +rvs);
        }

   }
