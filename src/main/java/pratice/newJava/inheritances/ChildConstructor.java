package pratice.newJava.inheritances;

public class ChildConstructor extends ParentConstructor {
    ChildConstructor() {
        System.out.println("I am Child Class ");
    }

    ChildConstructor(int roll) {
        System.out.println("Roll No :" + roll);

    }

    ChildConstructor(String name) {
        System.out.println("Name :" + name);
    }

    public static void main(String[] args) {
        new ChildConstructor();
        new ChildConstructor(12);
        new ChildConstructor("Nikhil");
       new GrandParentConstructor();
       new GrandParentConstructor();
      new GrandFatherConstructor1();
      new GrandFatherConstructor2();
      new GrandFatherConstructor3();

    }
}

class  ParentConstructor extends GrandParentConstructor {

   public void set() {
        System.out.println(" I am in Parent Class ");
    }

    public void get1(int idNo) {
        System.out.println("Id No :" + idNo);
    }

    public void get2(String companyName) {
        System.out.println("Company Name :" + companyName);
    }
}
class GrandParentConstructor {
    public void data(){
        System.out.println("I am in Grand Father Class");
    }
    public void data1(int sal){
        System.out.println("Salary in Rs. :"+sal);
    }
    public void data2(String roll){
        System.out.println("Designation :"+roll);
    }
}
class GrandFatherConstructor1 extends GrandFatherConstructor2{
    public void a(){
        System.out.println(" I am in GrandFather1 Class ");
    }
    public void a(int gateNo){
        System.out.println("Id No :"+gateNo);
    }
    public void a(String companyCEO){
        System.out.println("Company CEO Name :"+companyCEO);
    }
}
class GrandFatherConstructor2 extends GrandFatherConstructor3{
    public void b(){
        System.out.println(" I am in GrandFather2 Class ");
    }
    public void b(int boardNo){
        System.out.println("Board No :"+boardNo);
    }
    public void b(String companyGM){
        System.out.println("Company GM Name :"+companyGM);
    }
}
class GrandFatherConstructor3 {
    public void c(){
        System.out.println(" I am in GrandFather3 Class ");
    }
    public void c(int regNO){
        System.out.println("Board No :"+regNO);
    }
    public void c(String companyMD){
        System.out.println("Company MD Name :"+companyMD);
    }


    public static void main(String[] args) {
        ChildConstructor obj=new ChildConstructor();
    }
}