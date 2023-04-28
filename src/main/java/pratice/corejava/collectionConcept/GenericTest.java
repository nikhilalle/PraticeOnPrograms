package pratice.corejava.collectionConcept;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(50);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Nikhil");
        list2.add("Shrti");

        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('N');
        list3.add('S');

        System.out.println("   Iterator    ");

        for (Integer sr : list1) {
            System.out.println(sr);
        }
        for (String sr2 : list2) {
            System.out.println(sr2);
        }

        for (Character ch : list3) {
            System.out.println(ch);

        }

    }
}
