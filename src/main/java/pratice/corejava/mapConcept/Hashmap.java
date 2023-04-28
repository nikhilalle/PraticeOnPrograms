package pratice.corejava.mapConcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();{
            map.put(101,"Nikhil");
            map.put(102,"Nikhil1");
            map.put(103,"Shri1");
            map.put(104,"Shri2");
            map.put(105,"Ankita");
            System.out.println(map);

            Set<Map.Entry<Integer,String>> set=map.entrySet();

            System.out.println("-------------Iterator -------------");
            Iterator<Map.Entry<Integer,String>> ltr=set.iterator();
            while (ltr.hasNext()){
                System.out.println(ltr.next());
            }

            System.out.println("---------For each --------");
            for (Map.Entry<Integer,String> ent:set) {
                System.out.println(ent.getKey()+"    "+ent.getValue());
            }
        }

    }
}
