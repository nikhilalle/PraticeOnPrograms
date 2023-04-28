package pratice.newJava.newProgrmas.overRiding;

public class TestOverRiding extends TestOverRidingFather {
    public void get(){
        System.out.println("I am Over Riding Concept");
        System.out.println("________________");
    }
    public void m1(int roll,String name){
        System.out.println("I am Over Riding Concept");
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);

    }
    public void m2(String name,String companyName){
        System.out.println("I am Over Riding Concept");
        System.out.println("Roll No :"+name);
        System.out.println("Name :"+companyName);

    }

    public static void main(String[] args) {
        //1. Parent ref, Parent object
        TestOverRidingFather obj=new TestOverRidingFather();
        obj.get();
        obj.m1(102,"Nikhil");
        obj.m2("Nikhil","TCS");
        System.out.println("_______________");

        // Compiler will check if m1() & m2 method is present  TestOverRidingFather in  class or not
        // If it is present,then JVM will call the method of whoever class object is created i.e TestOverRidingFather


        //2. Child ref ,Child Obj

        TestOverRiding obj1=new TestOverRiding();
        obj1.get();
        obj1.m1(100,"Shri");
        obj1.m2("Shri","Wipro");
        System.out.println("_____________________");

        // Compiler will check if m1() & m2 method is present  TestOverRiding in  class or not
        // If it is present,then JVM will call the method of whoever class object is created i.e TestOverRiding



        // 3.Parennt Ref  , child Obj
        TestOverRidingFather obj3=new TestOverRiding();


        // ref of father Class and Obj of Child Class it will Complier Execute Obj class i.e Child Class

        // If it is Present, But JVM is Always Call Object we already Created i.e TestOverRiding
        // Object is Always Her child Of Ref Class
        obj3.get();
        obj3.m1(106,"Shruti");
        obj3.m2("Shruti","Capgemini");
        System.out.println("___________________");

        // Compiler will check if m1() & m2 method is present  TestOverRiding in  class or not
        // If it is present But JVM Is Call Object Of Created Class i.e TestOverRiding (Child Class)


        // 4.Grand Parent ref  , Grand Parent Obj

        TestOverRidingGrand obj4=new TestOverRidingGrand();

        obj4.get();
        obj4.m1(109,"Rohit");
        obj4.m2("Rohit","Novartis");
        System.out.println("___________________");

        // Compiler will check if m1() & m2 method is present  TestOverRidingGrand in  class or not
        // If it is present But JVM Is Call Object Of Created Class i.e TestOverRidingGrand (Same Ref & Same obj)
        // If it is Present  Their is no problem But JVM is Always Call Object we already Created i.e TestOverRidingGrand

        // 5. Parent Ref , Child Obj
        TestOverRidingFather obj5=new TestOverRiding();
        obj5.get();
        obj5.m1(100,"Snehal");
        obj5.m2("Snehal","Java");
        System.out.println("___________________");

         //6. grand Parent Ref ,Parent Obj
        TestOverRidingGrand obj6=new TestOverRidingFather();
        obj6.get();
        obj6.m1(140,"Harika");
        obj6.m2("Harika","Selenium-Java");
        System.out.println("___________________");

        // 7.Child Ref  ,

        TestOverRidingGrand obj7=new TestOverRiding();
        obj7.get();
        obj7.m1(100,"Snehal");
        obj7.m2("Snehal","Java");
        System.out.println("___________________");


        /*
        // 8 Child Ref , Parent Obj
        TestOverRiding obj8=new TestOverRidingFather();
        // 9. Ref Parent ,Grand Parent Obj
        TestOverRidingFather obj9=new TestOverRidingGrand();

      Note:- Compiler will check if m1() method is present in OverridingParent1 class or not
        // If it is present, then JVM will call the method of whoever class object is created
*/
    }


}
