package pratice.newJava.interfaceJava;

public class VehicleTest implements InterfaceTest1,InterfaceTest2{

/*  This is Child Class Of All Interfaces using Implements Keyword
 VehicleTest is Child Class
  InterfaceTest1 :- One Interface Class
  InterfaceTest2 :- Second Interface Class
 */
    @Override
    public void get1() {
        System.out.println(" I am in Get1 Method From Interface-Test-1");

    }

    @Override
    public void get2() {
        System.out.println(" I am in Get-2 Method From Test-1 Interface-Test-1");

    }

    @Override
    public void get3() {
        System.out.println(" I am in Get 3 Method From Interface-Test-1 ");

    }

    @Override
    public void test1() {
        System.out.println(" I am in Test 1 Method From Interface_Test-2 ");;

    }

    @Override
    public void test2() {
        System.out.println(" I am in Test 2 Method From Interface_Test-2 ");
    }

    @Override
    public void test3() {
        System.out.println(" I am in Test 3 Method From Interface_Test-2 ");
    }

    @Override
    public void stringp(String name) {

        System.out.println(name);
    }

    @Override
    public void intp(int a, int b) {
        int c;

        System.out.println(c=a+b);

    }

    public static void main(String[] args) {
        InterfaceTest1 obj=new VehicleTest();
        obj.get1();
        obj.get2();
        obj.get3();
        System.out.println("--------------------");
        InterfaceTest2 obj2=new VehicleTest();
        obj2.test1();
        obj2.test2();
        obj2.test3();
        obj2.stringp("Shri");
        obj2.intp(10,20);

    }
}
