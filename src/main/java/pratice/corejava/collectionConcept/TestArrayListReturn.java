package pratice.corejava.collectionConcept;


import java.util.ArrayList;
import java.util.ListIterator;

public class TestArrayListReturn {
    public ArrayList arrayReturn() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(" Data  "+list);
        return list;

    }

    public static void main(String[] args) {
        TestArrayListReturn obj = new TestArrayListReturn();
        System.out.println(obj.arrayReturn());

        ArrayList<Integer> atr = obj.arrayReturn();

        System.out.println("---- For Each Loop-----");

        for (Integer arr : atr) {
            System.out.println(arr);

        }
        System.out.println("---- For  Loop-----");

        for (int i = 0; i < atr.size(); i++) {
            System.out.println(atr.get(i));
        }

        System.out.println("---ListIterator- ----");

        ListIterator<Integer> itr = atr.listIterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}


