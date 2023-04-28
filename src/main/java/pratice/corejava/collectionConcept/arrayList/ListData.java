package pratice.corejava.collectionConcept.arrayList;

import java.util.HashSet;

public class ListData {
    public static void main(String[] args) {
//        LinkedList<Integer> str = new LinkedList<>();
//        str.add(23);
//        str.add(32);
//        str.add(3);
//        str.add(76);
//        str.add(13);
//        str.add(22);
//        str.add(33);
//        System.out.println(str);
//        Collections.sort(str);
//        System.out.println(str);
//        str.remove(4);
//        System.out.println(str);
//
//        System.out.println(str);
//        str.add(23);
//        // str.removeAll(str);
//        System.out.println(str);
//        System.out.println(str.isEmpty());
//        str.clear();
//        System.out.println(str);

        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set);

        for ( Integer i: set) {
            System.out.println(i);
        }





}
}

