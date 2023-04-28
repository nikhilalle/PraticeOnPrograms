package pratice.newJava.strings;



public class Teststring2 {
    public static void main(String[] args) {
        String str="Nikhilesh";

        String str2= " Alle";

        char [] cht={'N','I','K','H','I','L'};

        String [] chart={"Shri","Nikhi","Rohit"};

        System.out.println("LoweCase :"+str.toLowerCase());
        System.out.println("UperCase "+str.toUpperCase());
        System.out.println("Character Change :"+str.replace('i','e'));
        System.out.println("Name Change :"+str.replaceFirst("Nikhil","nik"));
        System.out.println("String Change :"+str.replace("nikhil","pratham"));
        System.out.println("Full Name :"+str.concat(str2));
        System.out.println("Index of Char H :"+str.indexOf('h'));
        System.out.println("Index of String Nikhil "+str.indexOf("nikh"));

        System.out.println(cht.length);
        System.out.println(chart.length);
        System.out.println("Start with :"+str.startsWith("Khil")); // False
        System.out.println("Start with :"+str.startsWith("Nik")); // True
        System.out.println("End with :"+str.endsWith("Khil")); // False
        System.out.println("End with :"+str.endsWith("lesh")); // True

        System.out.println("Add Statement "+str.concat(" Alle"));
        System.out.println("Add Statement "+str.concat(str2));

        System.out.println("SubString of Worlds ;"+str.substring(3,6));
        System.out.println("SubString :"+str.substring(2));
        System.out.println("SubString of Worlds ;"+str.substring(0,4));
        System.out.println("SubString :"+str.substring(4));


    }


}
