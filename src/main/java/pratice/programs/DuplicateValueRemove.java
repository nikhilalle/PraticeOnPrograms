package pratice.programs;

import java.util.*;

public class DuplicateValueRemove {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(43);
        list.add(12);
        list.add(4);
        list.add(23);
        list.add(45);
        list.add(12);
        System.out.println(list);
        Collections.sort(list);
        for (Integer lt : list) {
            System.out.println(lt);
        }
        System.out.println("-------------------");
        Set<Integer> st=new TreeSet<Integer>(list) ;
        System.out.println();
        for(Integer li:st){

            System.out.println(li);
        }
        System.out.println("-------------------");

    }
}




//list.clear();
//        list=new ArrayList<Integer>(st);
//        Collections.reverse(list);
//        for(Integer l1:list){
//        System.out.println(l1);
//        }
