package pratice.corejava.collectionConcept.setList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("Nikhil1");
        list.add("Aniket");
        list.add("Shri1");
        list.add("Nikhil2");
        list.add("Shri2");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        //Collections.sort(list);

        Iterator<String> ltr = list.iterator();
        while (ltr.hasNext()) {
            System.out.println(ltr.next());
        }

        LinkedHashSet<Integer> list1=new LinkedHashSet<>();
        list1.add(10);
        list1.add(50);
        list1.add(22);
        list1.add(50);
        list1.add(6);
        System.out.println(list1);
        System.out.println("Check Empty or not :"+list1.isEmpty());

        System.out.println(list1.size());
        Iterator<Integer> ltr1=list1.iterator();
        while (ltr1.hasNext()){
            System.out.println(ltr1.next());
        }

    }
}
