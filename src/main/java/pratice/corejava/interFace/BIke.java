package pratice.corejava.interFace;

public class BIke extends Car {

    public void colour(){
        System.out.println("I am in Bike Class  Colour Method ");
    }
    public void mileage(){
        System.out.println("I am in Bike Class mileage Method ");
    }

    public void speed() {
        System.out.println("I am in Bike Class Speed Method ");

    }

    public void model() {
        System.out.println("I am in Bike Class Model Method ");

    }

    public static void main(String[] args) {
        /**Vehicle' is abstract; cannot be instantiated
        *Vehicle obj=new Vehicle();
        * We can not create an Object of interface
         */
        Vehicle obj=new BIke();

        obj.colour();   // I am in Bike Class Colour Method
        obj.mileage();   // I am in Bike Class Mileage Method
        obj.speed();    //  I am in Bike Class Speed Method
        obj.model();    // I am in Bike Class Model Method
        Vehicle obj1=new Car();
        obj1.colour();   // I am in Car Class Colour Method
        obj1.mileage();  //  I am in Car Class Mileage Method
        obj1.speed();   //   I am in Car Class Speed Method
        obj1.model();   // I am in Car Class Model Method
    }









}
