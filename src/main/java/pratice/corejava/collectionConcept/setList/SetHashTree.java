package pratice.corejava.collectionConcept.setList;

import java.util.TreeSet;

public class SetHashTree {
    public static void main(String[] args) {
        TreeSet<Integer> list=new TreeSet<>();
        list.add(52);
        list.add(25);
        list.add(45);
        list.add(10);
        list.add(30);
        list.add(45);
        System.out.println(list); // [10, 25, 30, 45, 52]
        list.size();
        list.add(5);
        System.out.println(list); // [5, 10, 25, 30, 45, 52]
        list.headSet(15);
        System.out.println(list.descendingSet()); // [52, 45, 30, 25, 10, 5]
        System.out.println(list.comparator());
        System.out.println(list);  // [5, 10, 25, 30, 45, 52]
        System.out.println(list.first());  // 5
        System.out.println(list.last());  // 52



    }
}
