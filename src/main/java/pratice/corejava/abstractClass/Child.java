package pratice.corejava.abstractClass;

public class Child  extends Parent{

    @Override
    void home() {

        System.out.println("Home is Declared in Abstract  Grand-Parent Class Method name Home");
    }
    public void newCar(){
        System.out.println("I am Child  Class in New Car Method ");
    }

    public void newBike(){
        System.out.println("I am Child  Class in New Bike Method ");
    }

    public static void main(String[] args) {
       Child child=new Child();
       child.car();       //   Abstract Parent Class  Non Abstract Car Method
       child.bike();     //  Abstract Parent Class  Non Abstract Bike Method
       child.details();    //   Abstract GrandParent Class  Details Normal Method
        child.home();   // Home is Declared in Abstract  Grand-Parent Class Method name Home
       child.newCar();    // I am Child  Class in New Car Method
       child.newBike();  //  I am Child  Class in New Bike Method








    }
}
