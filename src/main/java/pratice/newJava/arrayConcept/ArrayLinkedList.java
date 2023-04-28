package pratice.newJava.arrayConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLinkedList {
    public static void main(String[] args) {
        ArrayList ltr=new ArrayList();
        ltr.add(10);
        ltr.add(50);

        ArrayList ltr1=new ArrayList();
        ltr1.add("Nikhil");
        ltr1.add("Shri");
        ltr1.add('N');

        ltr.addAll(ltr1);

        System.out.println(ltr);
        System.out.println("Using ListIterator ");
        ListIterator on= ltr.listIterator();
        while (on.hasNext()){
            System.out.println(on.next());
        }
        ltr.remove(Character.valueOf('N'));  // character Removed N

        System.out.println(ltr);

    }
}
