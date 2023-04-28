package pratice.newJava.programs;

public class TestMethod12 {
    int iD;
    String name;
    static String companyName="TCS";
    static String companyName1="Wipro";  // Static Keyword used
    public void get(int iD,String name){
        System.out.println("Company ID No: "+iD);
        System.out.println("Name :"+name);
        System.out.println("Company Name :"+TestMethod12.companyName);
        System.out.println("Company Name :"+ TestMethod12.companyName1);

    }
    public void get1(int iD,String name){
        System.out.println("Company ID No: "+iD);
        System.out.println("Name :"+name);
       // System.out.println("Company Name :"+TestMethod12.companyName);
        System.out.println("Company Name :"+ TestMethod12.companyName1);

    }

    public static void main(String[] args) {
        TestMethod12 obj=new TestMethod12();
        obj.get(101,"Shri");
        obj.get(102,"Nikhil");
        obj.get(103,"Avanti");
        obj.get(104,"Pratham");
        obj.get(105,"Harika");
        System.out.println("-----------------------");
        obj.get1(1101,"Rohit");
        obj.get1(1102,"Ajay");
        obj.get1(1103,"Rajesh");
        obj.get1(1104,"Ankhita");
        obj.get1(1105,"Pranoti");
    }
}
