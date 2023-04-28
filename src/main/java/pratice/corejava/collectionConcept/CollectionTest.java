package pratice.corejava.collectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
      List<String> list=new ArrayList<>();
      list.add("Nikhil");
      list.add("Shri");
      list.add("Anil");
      list.add("Shruti");
      list.add("Avanti");
      list.add("Rahul");
        System.out.println("Size "+list.size());
        list.add(5,"Anand");
        System.out.println(list.get(2));
        System.out.println(list.contains(list));
        Iterator<String> listItrator=list.iterator();
       while (listItrator.hasNext() ){
           System.out.println(listItrator.next());
            }
            }
        }


