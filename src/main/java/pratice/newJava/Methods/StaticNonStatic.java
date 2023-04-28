package pratice.newJava.Methods;

public class StaticNonStatic {
    int id;
    String name;
    static String companyName = "TCS";


    public void data(int id, String name) {
        System.out.println("Job Id:" + id);
        System.out.println("Name:" + name);
        System.out.println("Company Name: " + companyName);
        System.out.println("------------------");

    }

    public static void main(String[] args) {
        StaticNonStatic obj=new StaticNonStatic();
        obj.data(101,"Pankaj");
        obj.data(102,"Nikhil");

        obj.data(103,"Rahul");

        obj.data(104,"Shri");

        obj.data(105,"Anand");



    }
}
