package pratice.corejava.collectionConcept;

import java.util.ArrayList;

public class GenericNonGeneric {

        public static void main(String[] args) {
            ArrayList list = new ArrayList();
            list.add(50);
            list.add("Shruti");
            list.add(1020);
            list.add("Nikhil");


            System.out.println("   Without Generic ");

            for (Object obj : list) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    System.out.println(obj);
                } else if (obj instanceof Character) {
                    Character ch = (Character) obj;
                    System.out.println(obj);
                } else if (obj instanceof Integer) {
                    System.out.println(obj);
                }
            }

            System.out.println("   With Generic ");

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(10);
            list1.add(50);

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Nikhil");
            list2.add("Shrti");

            ArrayList<Character> list3 = new ArrayList<>();
            list3.add('N');
            list3.add('S');

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


