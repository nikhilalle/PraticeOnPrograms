package pratice.corejava.collectionConcept.arrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorConcept {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Nikhil1");
        list.add("Nikhil2");
        list.add("Nikhil3");
        list.add("Shri1");
        list.add("Shri2");
        list.add("Shri3");
        System.out.println(list);
        System.out.println(list.listIterator());
        Collections.sort(list);


        ListIterator<String> str=list.listIterator();

        System.out.println("----------ListIterator Previous ----------");

        /** -ListIterator Previous is not done Before NextListIterator Next because Curcure move down
         *  by Uing has hasNext() method then curcure postion is Forward  Directionl it is ast index then
         *  i will move found   previous data so using previous( ) we can move on revers Direction
         */
        str.next();
        str.next();
        str.next();
        str.next();
        System.out.println("Current Status: "+list);
        while (str.hasPrevious()) {
            System.out.println(str.previous());

        }
        System.out.println("_______________ New  Added");
        str.add("pankaj");
        System.out.println(list);

        System.out.println("----------ListIterator Next ----------");

        while (str.hasNext()){
            System.out.println(str.next());
        }
//str.previous();

        str.add("pankaj  Bhai");
        System.out.println(list);
        System.out.println("----------ListIterator Previous ----------");
        while (str.hasPrevious()) {
            System.out.println(str.previous());

        }


    }
}
