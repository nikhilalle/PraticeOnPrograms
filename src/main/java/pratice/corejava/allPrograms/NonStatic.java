package pratice.corejava.allPrograms;

public class NonStatic {
    int id=101;
    String name="Nikhil";
    String companyName="TCS";
    String jobRoll="Tester";

   public void data(){
        System.out.println("Job Id:"+id);
        System.out.println("Name:"+name);
        System.out.println("Company Name: "+companyName);
        System.out.println("Designation :"+jobRoll);
    }

    public static void main(String[] args) {
         NonStatic obj =new NonStatic();
       System.out.println("All Non Static Programs");
        System.out.println("Job Id:"+obj.id);
        System.out.println("Name:"+obj.name);
        System.out.println("Company Name: "+obj.companyName);
        System.out.println("Designation :"+obj.jobRoll);
    }
}
