package pratice.corejava.Constructor;

public class Constructor2 {
    int iD;
    int a;
    String name;
    String companyName;
    public Constructor2(int iD, String name, String companyName){
        this.iD=iD;
        this.name=name;
        this.companyName=companyName;
        System.out.println("I'd No:"+iD);
        System.out.println("Name :"+name);
        System.out.println("Company Name :"+companyName);

    }
    public Constructor2(int a){
        this.a=a;

        System.out.println("Value :"+a);
    }

    public static void main(String[] args) {
        new Constructor2(101,"Shri","TCS");
        new Constructor2(102,"Nikhil","Novarites");
        new Constructor2(103,"Pratham","Appollo");
        new Constructor2(301);
    }
}
