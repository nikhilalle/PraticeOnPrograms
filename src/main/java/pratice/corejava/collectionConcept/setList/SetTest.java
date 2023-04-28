package pratice.corejava.collectionConcept.setList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
    public static void main(String[] args) {
       HashSet<Integer>  list=new HashSet<>();
       list.add(10);
       list.add(20);
       list.add(25);
       list.add(5);
       list.add(15);

        System.out.println(list);  // [20, 5, 25, 10, 15] value not Preserver
        System.out.println("Max Value  "+Collections.max(list));
        System.out.println("Min Value  "+Collections.min(list));
        System.out.println("Is Empty Or Not "+Collections.emptyList());
        System.out.println("Size  "+list.size());
        System.out.println("Is Empty Or Not "+list.isEmpty()); //false
        list.contains(25);
        System.out.println(list.equals(list));
        //list.removeAll(list);

        System.out.println("retainAll   "+list.retainAll(list));
//Collections.reverse(list);
        System.out.println(list); // [20, 5, 25, 10, 15]
        list.remove(2);
        System.out.println(list.equals(5));
        System.out.println(list);

        System.out.println("---------Itertor-----------");

        Iterator<Integer> ltr= list.iterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }


    }
    }

