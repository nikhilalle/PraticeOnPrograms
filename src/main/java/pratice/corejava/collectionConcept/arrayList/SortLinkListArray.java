package pratice.corejava.collectionConcept.arrayList;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkListArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Nikhil3");
        list.add("Nikhil1");
        list.add("Shri2");
        list.add("Shri3");
        list.add("Shri1");
        list.add("Nikhil2");

        System.out.println(list);  // [Nikhil3, Nikhil1, Shri2, Shri3, Shri1, Nikhil2]

        Collections.sort(list); //[Nikhil1, Nikhil2, Nikhil3, Shri1, Shri2, Shri3]

        System.out.println(list);
        System.out.println(Collections.min(list)); // Nikhil1

        System.out.println(Collections.max(list));   // Shri3
        Collections.reverse(list); // [Shri3, Shri2, Shri1, Nikhil3, Nikhil2, Nikhil1]
        System.out.println(list);

      Collections.sort(list); //[Nikhil1, Nikhil2, Nikhil3, Shri1, Shri2, Shri3]
        System.out.println(list);
    }
}
