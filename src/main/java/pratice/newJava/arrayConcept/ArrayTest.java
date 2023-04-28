package pratice.newJava.arrayConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        obj.add(20);
        obj.add(57);
        obj.add(25);
        obj.add("Nikhil");
        obj.add("Shri");
        obj.add('N');

        for (Object arr : obj) {
            System.out.println(arr);
        }

        /* OutPut
        * [20, 57, 25, Nikhil, Shri,'N']
        */
        System.out.println("Size of Array  : "+obj.size());

        System.out.println("__________________");

        obj.remove(5);

        // [20, 57, 25, Nikhil, Shri] // 5 th Index N is Removed

        System.out.println(obj);

        System.out.println("__________________");

        System.out.println(obj.isEmpty());   // false

        ArrayList obj1 = new ArrayList();
        obj1.add("Rohan");
        obj1.add("Shruti");

        obj.addAll(obj1); // add two values ie Rohan,Shruti  in obj

        System.out.println(obj);  //[20, 57, 25, Nikhil, Shri, Rohan, Shruti]


        System.out.println(obj.get(1)); // Find 1 th Index value is 57

        System.out.println(obj);  //[20, 57, 25, Nikhil, Shri, Rohan, Shruti]

        obj.remove("Rohan");      //  remove 5th index Value is Rohan Removed

        System.out.println(obj);   //[20, 57, 25, Nikhil, Shri, Shruti]

        System.out.println("--------By Using For Each-----------");

        for (Object a : obj) {
            System.out.println(a);
        }
        System.out.println("------- By using listIterator() ------- ");

        // listIterator is a method present in ArrayList class, its return Type is ListIterator

        ListIterator  ltt=obj.listIterator();
        while (ltt.hasNext())
        {
            System.out.println(ltt.next());
        }
        /* OutPut
        20
        57
        25
        Nikhil
        Shri
        Shruti
         */
        System.out.println("------- By using For Loop ------- ");

    for (int i=0;i<obj.size();i++){
        System.out.println(obj.get(i));
    }


    }
    }
