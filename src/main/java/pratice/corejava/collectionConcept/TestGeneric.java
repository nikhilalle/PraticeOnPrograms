package pratice.corejava.collectionConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestGeneric {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(50);
        list.add("Nikhil");
        list.add("Shruti");

        ListIterator ltr = list.listIterator();
        while (ltr.hasNext()) ;
        {
            System.out.println(ltr.next());

        }
        // WithOut Generic
        for (Object obj : list) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(obj);
            } else if (obj instanceof Integer) {
                System.out.println(obj);
            }


        }


    }
}