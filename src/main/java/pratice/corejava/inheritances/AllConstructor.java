package pratice.corejava.inheritances;

public class AllConstructor {
    static String companyName="TCS";
    AllConstructor(){
        System.out.println("I am In  Zero Parameter Constructor");
    }
    AllConstructor(int roll){
        System.out.println(" Roll No : "+roll);
    }
    AllConstructor(String name){
        System.out.println(" Name : "+name);
    }
    AllConstructor(String name,int id){
        System.out.println(" Name : "+name+" ID No "+id);
        System.out.println("Company Name "+companyName);
        System.out.println("Using Class Name Company Name "+AllConstructor.companyName);

    }
    AllConstructor(String name,String code) {
        System.out.println("Name : " + name);
        System.out.println("Code of Emp : " + code);
        System.out.println("Using Class Name Company Name " + AllConstructor.companyName);

    }
        public static void main(String[] args) {
        new AllConstructor();
        new AllConstructor(101);
        new AllConstructor("Nikhil",12);
        new AllConstructor("Shri","Testing");

    }

}
