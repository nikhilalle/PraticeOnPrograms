package pratice.corejava.variables;



import java.util.ArrayList;
import java.util.ListIterator;

public class GenriceNonGenrice {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(20);
        list.add(50);
        list.add("Nikhil");
        list.add("Shruti");

        ListIterator lt = list.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
        System.out.println("With of Generice");

        for (Object obj : list) {
            if (obj instanceof String) {
                String str = (String) obj;
                System.out.println(str);
            } else if ((obj instanceof Integer)) {
                System.out.println(obj);
            } else if ((obj instanceof Character)) {
                Character ch = (Character) obj;
            }

        }
        System.out.println("With Generice");

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(30);
        arr.add(60);
        arr.add(100);

        ListIterator arry = arr.listIterator();
        while (arry.hasNext()) {
            System.out.println(arry.next());
        }

    ArrayList<String> st=new ArrayList<>();
       st.add("Shri");
        st.add("Nikhil");
        st.add("Shruti");

    ListIterator st1=st.listIterator();
        while (st1.hasNext()){
        System.out.println(st1.next());
    }
}
    }

