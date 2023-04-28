package pratice.corejava.collectionConcept.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Pradip");
        list.add("Nikhil1");
        list.add("Nikhil2");
        list.add("Nikhil3");
        list.add("Shri1");
        list.add("Ankit");

        System.out.println(list); // [Pradip, Nikhil1, Nikhil2, Nikhil3, Shri1, Ankit]


        list.add(2,"Shruti");
        System.out.println(list);     // [Pradip, Nikhil1, Shruti, Nikhil2, Nikhil3, Shri1, Ankit]
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        list.addLast("Nikhil3");
        list.addFirst("Shri");
        System.out.println(list); // [[Shri, Nikhil1, Shruti, Nikhil2, Nikhil3, Shri1, Nikhil3]

        System.out.println("Get Value of 5th Index "+list.get(5));

       //list.remove(4);  // Remove Nikhil3 it will remove on 4th index its self
        list.remove("Nikhil3");  // Remove Nikhil3

        //list.remove("Nikhil3"); // [Shri, Nikhil1, Nikhil2, Shruti, Shri1, Nikhil3]

        System.out.println(list.remove("Nikhil3")); // Remove Nikhil3 it will remove on 5th index its self

        System.out.println(list.remove("Nikhil3")); // There is no any String Available in Nikhil3 so false Print

        System.out.println(list); //[Shri, Nikhil1, Shruti, Nikhil2, Shri1]
        //list.clear(); Clear all Data []

        System.out.println(list);

        ListIterator<String> str=list.listIterator();

        System.out.println("----------ListIterator Next ----------");

        while (str.hasNext()){
            System.out.println(str.next());
        }

        System.out.println("----------ListIterator Previous ----------");
        while (str.hasPrevious()) {
            System.out.println(str.previous());

        }



        }
        }



