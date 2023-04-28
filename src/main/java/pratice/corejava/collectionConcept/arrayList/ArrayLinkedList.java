package pratice.corejava.collectionConcept.arrayList;

import java.util.*;

public class ArrayLinkedList {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        str.add("Nikhil1");
        str.add("Nikhil2");
        str.add("Nikhil5");
        str.add("Nikhil3");
        str.addLast("Shruti");
        str.addFirst("Shri1");
        str.remove(3);
        System.out.println("Before Sorting");

        Collections.sort(str, Collections.reverseOrder());

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + str);

        System.out.println("--------------------");

        System.out.println(str);
        Collections.sort(str);



        System.out.println("After Sorting  " + str);
        Collections.sort(str, Comparator.reverseOrder());
        System.out.println("  ReverseOrder   " + str);

        //  set as per Array using Sort Method
        Collections.sort(str);

        System.out.println("After Sorting  " + str);

        System.out.println("Using For Each");
        for (String st : str) {
            System.out.println(st);
        }

        System.out.println("Using ListIterator");
        ListIterator<String> sr = str.listIterator();
        while (sr.hasNext()) {
            System.out.println(sr.next());
        }

        System.out.println("Using Iterator");
        Iterator<String> srr = str.listIterator();
        while (sr.hasNext()) {
            System.out.println(sr.next());
        }

        System.out.println("Using For Loop");

        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
