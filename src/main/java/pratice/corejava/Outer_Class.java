package pratice.corejava;

public class Outer_Class {
    long OutAccount_No = 12345;
    int OutBalance = 10000;

    public void outerClassDetails() {
        System.out.println(" Outer   Class    Details    ");
        System.out.println(OutAccount_No);
        System.out.println(OutBalance);
    }

    public static class Inner_Class {
        long account_No = 67890;
        int balance = 20000;

        public void innerClassDetails() {
            System.out.println("  Inner Class  Details    ");
            System.out.println(account_No);
            System.out.println(balance);
        }

        public void main(String[] args) {
            Outer_Class out = new Outer_Class();
            out.outerClassDetails();
            // out.innerClassDetails();   we Can't Call inner Class Method in Outer Class Using Outer Class    Object
            Inner_Class in = new Inner_Class();
            in.innerClassDetails();
            // in.outerClassDetails();    we Can't Call outer Class Method in Inner Class Using Inner Class    Object

            // We can't Create main method in Inner Class it Should not Allow
// We Can't Create  Inner Class Main  Method
        }
    }

    public static void main(String[] args) {
        Outer_Class out = new Outer_Class();
        out.outerClassDetails();
        Inner_Class in = new Inner_Class();
        in.innerClassDetails();
        // out.innerClassDetails();
        // in.outerClassDetails()

        /**
         out.innerClassDetails();   we Can't Call inner Class Method in Outer Class Using Outer Class    Object

         1. Inner Class should be Static then it Allow in Inner  Class Object Creation
         2. if  we create Non - Static Inner Class Then We can't Create Object of Inner Class    and
         3. Inner Class  Should be Static
         4.  We Can't Create  Inner Class Main  Method

         in.outerClassDetails();    we Can't Call outer Class Method in Inner Class Using Inner Class    Object

         */
    }

}
