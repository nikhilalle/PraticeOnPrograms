package pratice.corejava.collectionConcept.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkListCollections {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Shri4");
        list.add("Nikhil3");
        list.add("Shri2");
        list.add("Nikhil2");
        list.add("Shrti");
        list.add("Shri1");
        list.add("Ankit");
        list.add("Nikhil1");
        System.out.println(list);  //[Shri4, Nikhil3, Shri2, Nikhil2, Shrti, Shri1, Ankit, Nikhil1]

        Collections.sort(list); // [Ankit, Nikhil1, Nikhil2, Nikhil3, Shri1, Shri2, Shri4, Shrti]
        System.out.println("Is Empty or Not  "+list.isEmpty());
        System.out.println("Index Value  "+list.get(4));

        System.out.println(list);
        Collections.reverse(list); //[Shrti, Shri4, Shri2, Shri1, Nikhil3, Nikhil2, Nikhil1, Ankit]
        Collections.sort(list);
        list.clear();
        System.out.println("Min Value :"+Collections.min(list)); // Min Value :Ankit
        System.out.println("Max Value :"+Collections.max(list)); // Max Value :Shrti
        System.out.println(list); //[Shrti, Shri4, Shri2, Shri1, Nikhil3, Nikhil2, Nikhil1, Ankit]


    }}
