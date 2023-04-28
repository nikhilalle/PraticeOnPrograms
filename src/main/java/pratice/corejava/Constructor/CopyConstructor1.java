package pratice.corejava.Constructor;

public class CopyConstructor1 {
    int  iD;
    String name;
    String companyName;
    public CopyConstructor1(int iD,String name,String companyName){
        this.iD=iD;
        this.name=name;
        this.companyName=companyName;
        System.out.println("Id No :"+iD);
        System.out.println("Name :"+name);
        System.out.println("Company Name"+companyName);
    }
    public CopyConstructor1(CopyConstructor1 nik){
        System.out.println("I am in CopyConstructor ");
    }

    public static void main(String[] args) {
        CopyConstructor1 obj=new CopyConstructor1(101,"Shri","Novarties");
        CopyConstructor1 obj1=new CopyConstructor1(102,"Nikhil","Wipro");
        CopyConstructor1 obj2=new CopyConstructor1(104,"Pratham","TCS");
        CopyConstructor1 obj5=new CopyConstructor1(obj);



    }
}
