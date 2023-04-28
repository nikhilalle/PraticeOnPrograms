package pratice.newJava.Methods;

public class SimpleMethod {
    static  String company="TCS";

    public  void details(String name, int job_id, String designation) {
        System.out.println(name);
        System.out.println(company);
        System.out.println(job_id);
        System.out.println(designation);
        System.out.println("---------------");
    }
    public  void details1(String name, int job_id, String designation) {
        System.out.println(name);
        System.out.println(job_id);
        System.out.println(designation);
        System.out.println("---------------");
    }

    public  void get(String name, String company,int job_id, String designation) {
        System.out.print(name);
        System.out.print("   "+company);
        System.out.print("  "+designation);
        System.out.print("  "+this.company);
        System.out.print("   "+job_id);
        System.out.print("--------");
        System.out.print("  "+SimpleMethod.company);
        System.out.println();
    }
    public static void main(String[] args) {
        SimpleMethod obj = new SimpleMethod();
        obj.details("Nikhil",101,"MRM");
        obj.details("Shri",102,"SRM");
        obj.details("Shruti",103,"FRM");
        obj.details("Anu",104,"FRM");
        obj.details("Avanti",105,"TRM");
        System.out.println("--------------NO TCS ---------------------");
        obj.details1("Nikhil",101,"MRM");
        obj.details1("Pooja",102,"SRM");
        obj.details1("Kiran",103,"FRM");
        obj.details1("Pankaj",104,"FRM");
        obj.details1("Suvi",105,"TRM");
        obj.get("Nikhil","Wipro",101,"MRM");
        obj.get("Pooja","Amazon",102,"SRM");
        obj.get("Kiran","Quicker",103,"FRM");
        obj.get("Pankaj","Tata",104,"FRM");
        obj.get("Suvi","Kia",105,"TRM");
    }

}
