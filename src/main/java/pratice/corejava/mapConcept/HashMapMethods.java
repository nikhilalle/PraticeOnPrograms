
package pratice.corejava.mapConcept;
import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();
        {
            map.put(101, "Nikhil");
            map.put(102, "Nikhil1");
            map.put(103, "Shri1");
            map.put(104, "Shri2");
            map.put(105, "Anusha");
            System.out.println(map);

            System.out.println(map.get(105));  // Check value of 105 key

            System.out.println(map.isEmpty());  // Check Map set is Empty or Not

            System.out.println(map.keySet());  // print only Key

            System.out.println(map.size());   // Check Size

            System.out.println(map.put(109, "Shruti"));  // Add New Entry

            System.out.println(map);

            System.out.println(map.values()); // print only Value

            System.out.println(map.containsKey(1054));   // key available or not if it is available then true
            // Otherwise False
            // map.clear();   // it is clear ALL KEY & VALUES

            System.out.println(map);

            map.replace(105, "Shri5");  // replace this key ,value( 105, "Anusha");

            System.out.println(map);
/*
            Map<Integer, String> map1 = new HashMap();
            {
                map1.put(201, "Shruti");
                map1.put(202, "Avanti");
                map1.put(303, "Ankita");

                // map.putAll(map<Integer,String>);

            }
            */

        }
    }
}