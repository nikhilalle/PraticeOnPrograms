package pratice.newJava.strings;

public class StringTest {
    public static void main(String[] args) {
        String str="Shriniwas";
        String str1="Nikhil";

        System.out.println("Start With :"+str.startsWith("Shri"));
        System.out.println("Start With :"+str.startsWith("niw")); //false
        System.out.println("Start With :"+str1.startsWith("Nik"));
        System.out.println("End With :"+str.endsWith("niwas"));
        System.out.println("End With :"+str1.endsWith("hil"));
        System.out.println("Adding Of String : "+str1.concat("eSh"));
        System.out.println("Adding  Of String : "+str.concat(" Alle"));
        System.out.println("Replace fo  l to S Char:"+str1.replace('l','s'));
        System.out.println("Replace fo  w to  v Char:"+str.replace('w','v'));
        System.out.println("Replace fo  NIK to ANI Char:"+str1.replaceFirst("Nik","Anik"));
        System.out.println("Replace fo  was to vas Char:"+str.replaceFirst("was","vas"));
        System.out.println("Char index K:"+str1.indexOf("K"));
        System.out.println("Char index N:"+str.indexOf("n"));
        System.out.println("String Index of Niwas :"+str.indexOf("niwas"));
        System.out.println("String Index of Khil :"+str1.indexOf("khil"));
        System.out.println("Last Index of Char H:"+str1.lastIndexOf('h'));
        System.out.println("Last Index of Char K :"+str1.lastIndexOf('k'));
        String str5="";
        System.out.println("Is Empty() :"+str5.isEmpty()); // { Ans is TRUE} No any Value Like Str 5="" (Blank )
        System.out.println("Last Index of String KHIL:"+str1.lastIndexOf("khil"));





    }
}
// Email allenikhilalle@gmail.com 199 *199*1#