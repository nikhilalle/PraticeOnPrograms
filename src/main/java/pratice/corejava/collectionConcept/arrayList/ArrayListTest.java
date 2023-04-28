package pratice.corejava.collectionConcept.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList list =new ArrayList();
        list.add(20);
        list.add("Shri");
        list.add(50);
        list.add('S');
        list.add(12.5f);
        System.out.println(list);
        list.remove(12.5f);
        System.out.println(list);
        System.out.println(list.size());
        list.add(100);
        list.add(50);
        System.out.println(list.add('M'));
        Collections.sort(list);
        System.out.println(list);
      //  Collections.sort(list,Collections.reverseOrder());


        System.out.println(list);

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.iterator());  // Given Address
        System.out.println("----------ListIterator Next ----------");
        ListIterator ltr=list.listIterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }

        System.out.println("----------ListIterator Previous ----------");

        /** ListIterator Previous is not done due to it is an Arraylist It was Index Based it is use Inserction order
         * is not not come back whenever we enter the value is will Forward Direction Not Backword Direction
         * so ListIterator Previous is not execute here
         */
        ArrayList list1 =new ArrayList();
        list1.add(10);
        list1.add("Nikhil");
        list1.add(120);
        list1.add('L');
        list1.add(25.5f);

        System.out.println(list1);

        ListIterator ltr1=list1.listIterator();
        while (ltr1.hasPrevious()){
            System.out.println(ltr1.previous());
        }
    }
}
