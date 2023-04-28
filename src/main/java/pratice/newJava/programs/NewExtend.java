package pratice.newJava.programs;


    class Vehicle1 {
        Vehicle1() {
            System.out.println("I am In Vehicle Class");
        }
    }
    class FourWheeler1 extends Vehicle1 {
        FourWheeler1(){
            System.out.println("I am In Four-Wheeler Class");
        }
    }
    class TwoWheeler1 extends FourWheeler1 {
        TwoWheeler1() {
            System.out.println("I am In Two-rWheeler Class");
        }
    } //main Multi-Level is (Two-wheeler is automatically created another Clsss )
        // Two-Wheeler so it was Extend Four-Wheeler & Four-Wheeler Extend Vehicle Base Class is Two-Wheeler
        class MultiLevel {


            public static void main(String[] args) {

                TwoWheeler1 obj1 = new TwoWheeler1();
            }
        }





