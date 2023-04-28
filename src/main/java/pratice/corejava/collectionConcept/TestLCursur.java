package pratice.corejava.collectionConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestLCursur {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(52);
        list.add(23);
        list.add(20);
        list.add(5);

        System.out.println(list);

        ListIterator ltr=list.listIterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }

        System.out.println("------ HAS PREVIOUS------------");
        while (ltr.hasPrevious()){
            System.out.println(ltr.previous());

        }
        System.out.println("------------------");

        ArrayList<String> list1=new ArrayList<>();
        list1.add("Shri");
        list1.add("Nikhil");
        list1.add("Shruti");
        list1.add("Radha");

       ListIterator lte=list1.listIterator();

       while (lte.hasNext()){
           System.out.println(lte.next());
       }
        System.out.println("------ HAS PREVIOUS------------");

       while (lte.hasPrevious()){
           System.out.println(lte.previous() );
       }
    }
}
