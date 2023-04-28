package pratice.newJava.inheritances;

public class Parent   extends GrandParent {
    public void set(){
        System.out.println(" I am in Parent Class ");
    }
    public void get1(int idNo){
        System.out.println("Id No :"+idNo);
    }
    public void get2(String companyName){
        System.out.println("Company Name :"+companyName);
    }
}
