package pratice.corejava.abstractClass;

public abstract class Parent  extends Grand_Parent{
    @Override
    void car() {
        System.out.println(" Abstract Parent Class  Non Abstract Car Method  ");
    }

    @Override
    void cycle() {
        System.out.println(" Abstract Parent Class  Non Abstract Cycle Method  ");

    }

    @Override
    void bike() {
        System.out.println(" Abstract Parent Class  Non Abstract Bike Method  ");

    }

    public static void main(String[] args) {
       /** Parent obj = new Parent();
        obj.bike();
        obj.details();
        obj.car();
        obj.cycle();

        // we CAN'T Create Abtract Class Object i.e Parent is Abstract Class so
        we Can't Create its Object
        in Class Grand:Parent Class Home Can Be Declared We can Declared in Child Class
        Lets us See  What Happen
        We Call AllThis Methods in Child Class Along With Home Method
        **/

    }
    }

