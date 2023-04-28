package pratice.corejava.collectionConcept;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestGeneric2 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(50);
        list.add(100);
        list.add("Shri");
        list.add("Nikhil");

        for (Object obj:list) {
            if (obj instanceof String){
                String str = (String) obj;
                System.out.println(obj);

            }else if(obj instanceof Character){
                Character ch=(Character) obj;
                System.out.println(obj);

            }else if(obj instanceof  Integer){
                System.out.println(obj);
            }

        }
        System.out.println("   ListIterator    ");

        ListIterator lst=list.listIterator();
        while (lst.hasNext()){
            System.out.println(lst.next());
        }
        for (Object obj1:list) {
            if(obj1 instanceof  String){
                String str3=(String) obj1;

                System.out.println(obj1);
            }else if (obj1 instanceof Integer){
                System.out.println(obj1);
            }

        }
    }
}
