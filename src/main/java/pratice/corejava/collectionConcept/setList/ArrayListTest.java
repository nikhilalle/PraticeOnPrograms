package pratice.corejava.collectionConcept.setList;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("Shri1");
        list1.add("Shri2");
        list1.add("Shri3");
        list1.add("Shri4");
        list1.add("Shri5");
        list1.add("Shri6");
        ListIterator lItr = list1.listIterator();
        System.out.println(lItr);

        while (lItr.hasNext()) {
            System.out.println(lItr.next());
        }
        lItr.next();
        lItr.next();
        while (lItr.hasPrevious()){
            System.out.println("___________");
            System.out.println(lItr.previous());
        }


    }
}
