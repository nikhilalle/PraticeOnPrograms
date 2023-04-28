package pratice.newJava.inheritances;

   class Vehicle {
        Vehicle() {
            System.out.println("I am In Vehicle Class");
        }
    }
    class FourWheeler extends Vehicle{
        FourWheeler(){
            System.out.println("I am In Four-Wheeler Class");
        }
    }
    class TwoWheeler extends FourWheeler{
        TwoWheeler(){
            System.out.println("I am In Two-rWheeler Class");
        }

       // public class MultiLevel{} // Main Class open & Closed means it was not used

        //main Multi-Level is (Two-wheeler is automatically created another Class )
        // Two-Wheeler so it was Extend Four-Wheeler & Four-Wheeler Extend Vehicle Base Class is Two-Wheeler


    public static void main(String[] args) {

        TwoWheeler obj1 = new TwoWheeler();


    }
}
