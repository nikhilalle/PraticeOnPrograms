package pratice.corejava.collectionConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class collectionConcepts {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Shri");
        list.add("Nikhil");
        list.add(10);
        list.add(20);

        ListIterator ltt = list.listIterator();
        while (ltt.hasNext()) {
            System.out.println(ltt.next());
        }
        System.out.println("   WithOut Generic    ");
        // WithOut Generic
        for (Object obj : list) {    // for each on object type
            if (obj instanceof String) {  //   Type Checking  (obj instanceof String)

                String str = (String) obj;  // Type Casting  obj to String i.e :-  String str = (String) obj;

                System.out.println(str);

            } else if (obj instanceof Character) {
                Character ch = (Character) obj;
                System.out.println(ch);
            } else if (obj instanceof Integer) {
                System.out.println(obj);
            } else if (obj instanceof Double) {
                System.out.println(obj);
            }

        }
    }
}
