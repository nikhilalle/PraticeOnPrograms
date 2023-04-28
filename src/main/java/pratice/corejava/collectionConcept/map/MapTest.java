package pratice.corejava.collectionConcept.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
       HashMap<Integer,String>  list=new HashMap<>();
       list.put(101,"Nikhil2");
       list.put(105,"Shri1");
       list.put(110,"Nikhil3");
       list.put(103,"Shri2");
       list.put(102,"Nikhil1");
       list.put(106,"Shri2");
        System.out.println(list); //{101=Nikhil2, 102=Nikhil1, 103=Shri2, 105=Shri1, 106=Shri2, 110=Nikhil3}

        list.put(105,null);
        list.put(110,"Nikhil2");
        System.out.println(list);

        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.replace(102,"Shruti");
        System.out.println(list.entrySet());
        HashMap<Integer,String> list1=new HashMap<>();
        list1.put(201,"Harika");
        list1.put(203,"Radhika");
        list1.put(202,"Aarika");
        list.putAll(list1);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.containsKey(2030));   // Key Check 2030 not Available so false
        System.out.println(list.containsValue("Shruti")); // // Value Check Shruti  Available so True

        System.out.println(list.entrySet());
        /*
        {101=Nikhil2, 102=Shruti, 103=Shri2, 105=null, 201=Harika, 106=Shri2, 202=Aarika, 203=Radhika, 110=Nikhil2}
         */


        Set<Map.Entry<Integer, String>> set = list.entrySet();

        Iterator<Map.Entry<Integer,String>> ltr= set.iterator();
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }

        }


    }

