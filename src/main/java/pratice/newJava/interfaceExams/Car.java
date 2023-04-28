package pratice.newJava.interfaceExams;

public class Car extends Vehicle {

    @Override
    void colour() {
        System.out.println("I am in Colour Method of  Vehicle Interface extend in Car Class");

    }

    @Override
    void type() {
        System.out.println("I am in Type Method of  Vehicle Interface extend in Car Class");

    }

    @Override
    void price() {
        System.out.println("I am in Price Method of  Vehicle Interface extend in Car Class");

    }

    @Override
    void start() {
        System.out.println("I am in Start Method of  Vehicle Interface extend in Car Class");

    }
    public void detail(){
        super.detail(); // it is Invoked in Interface Class
        System.out.println("I am in Details Method in CAR Class");
    }

    public static void main(String[] args) {
        // Car car=new Vehicle();   We  Can't create an Object of Vehicle bcz it is  an Interface
        Vehicle obj=new Car();
        obj.colour();
        obj.type();
        obj.price();
        obj.start();
        obj.detail();

        /**
        Out-Put
        I am in Vehicle Class Constructor   (Invoked in Vehicle  Class Constructor
        I am in Colour Method of  Vehicle Interface extend in Car Class
        I am in Type Method of  Vehicle Interface extend in Car Class
        I am in Price Method of  Vehicle Interface extend in Car Class
        I am in Start Method of  Vehicle Interface extend in Car Class
        I am in Details Method in Vehicle Class
        I am in Details Method in CAR Class
         **/

    }
}
