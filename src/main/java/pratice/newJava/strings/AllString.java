package pratice.newJava.strings;

public class AllString {
    public static void main(String[] args) {
        String str = "Nikhilesh";

        char[] chArr = str.toCharArray();
        for (char ab : chArr) {
            System.out.println(" " + ab);
        }


        System.out.println("Name : " + str);

        // string -> char[] , { 'S=0','h=1'..... 's=8'}

        String[] stArr = {"Nikhi", "lesh", "alle"};
        char[] ch1 = {'S', 'H', 'R', 'I', 'N', 'I', 'W', 'A', 'S'};

        System.out.println("_______New Char______");

        for (char chr : ch1) {
            System.out.println(chr);

            // every line single character
            System.out.print(chr + "-"); // single line with space
            //        }
            System.out.println();

            // New Formula Using ToCharArray Method We can String to Array Char

            String str5 = "Prathamesh";

            char[] chArr1 = str5.toCharArray();   // { P,r,a,t,h,a,m,e,s,h} We can Convector String to Array Char

            for (char chr4 : chArr1) {
                //System.out.println(chr);
                System.out.print(chr4 + " ");
            }
            System.out.println();

            // for each

            String[] stry = {"Nikhil", "esh", "alle"};

            for (String st : stry) {
                System.out.println(st);
                System.out.println("_____________");
                System.out.print(st + " ");
            }


            System.out.println();

            char[] chry = {'S', 'H', 'R', 'I', 'N', 'I', 'W', 'A', 'S'};
            // for loop
            for (int i = 0; i <= 8; i++) {
                System.out.println(chry[i]); // chArr[0], chArr[1], chArr[2]
            }

            for (int i = 0; i <= 3; i++) {
                System.out.println(stry[i]); // chArr[0], chArr[1], chArr[2]
            }

        }

    }
}
