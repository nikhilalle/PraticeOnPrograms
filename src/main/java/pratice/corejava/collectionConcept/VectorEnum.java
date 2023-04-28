package pratice.corejava.collectionConcept;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        vector.add(12);
        vector.add(12);
        vector.add(20);
        vector.add(34);
        vector.add(50);

        Enumeration<Integer> ee=vector.elements();
       while (ee.hasMoreElements()){
            System.out.println(ee.nextElement());
        }
    }
}
