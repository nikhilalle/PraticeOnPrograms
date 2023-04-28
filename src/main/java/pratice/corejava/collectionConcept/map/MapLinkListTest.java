package pratice.corejava.collectionConcept.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapLinkListTest {
    public static void main(String[] args) {
        LinkedHashMap<String,String> data=new LinkedHashMap<>();
        data.put("Shriniwas","Alle");
        data.put("Nikhilesh","Alle");
        data.put("Pratham","Alle");
        data.put("Nagesh","Alle");
        data.put("Anil","Alle");
        data.put("Shruti","Alle");
        System.out.println(data);
        // {Shriniwas=Alle, Nikhilesh=Alle, Pratham=Alle, Nagesh=Alle, Anil=Alle, Shruti=Alle}
        System.out.println(data.size());
        System.out.println(data.get(data));
        System.out.println(data.keySet()); //[Shriniwas, Nikhilesh, Pratham, Nagesh, Anil, Shruti]
        System.out.println(data.values()); // [Alle, Alle, Alle, Alle, Alle, Alle]
        System.out.println(data.replace("Akhilesh","Alle"));
        System.out.println(data);


        // {Shriniwas=Alle, Nikhilesh=Alle, Pratham=Alle, Nagesh=Alle, Anil=Alle, Shruti=Alle}

        Set<Map.Entry<String,String>> map=data.entrySet();


        Iterator<Map.Entry<String, String>> ltr=map.iterator();

        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }


    }
}
