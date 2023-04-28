package pratice.corejava.collectionConcept;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(15);

        // list.add(new Integer(15)); // Auto Boxing  it is automatically Assigned whenever we add Element in ArrayList
        // Primitive and Non-Primitive data type is automatically autoboxing ie convert to data type into object
        // ie list.add(new Integer(15));

        list.add(32);
        list.add(25);
      list.add("Nikhil");

        // list.add(new String("Nikhil"));  // Auto Boxing

        System.out.println(list);

        // Primitive datatype   Wrapper Classes
        //      int          -> Integer
        //      char         -> Character
        //      short        -> Short
        //      long         -> Long
        //      boolean      -> Boolean
        //      float        -> Float
        //      byte         -> Byte
        //      double       -> Double

        int a=50;   // Primitive Data Type
        Integer b=new Integer(a);  // Primitive Data Type  is Converct to Object i.e Auto Boxing
        System.out.println(b);

        String s="Nikhil";
        String str=new String(s);
        System.out.println(s);
        String w=str;
        System.out.println(w);

        int t=540;
        Integer d=new Integer(t);  // Boxing  Primitive to Obj
        int q=d;                  // Un-Boxing  Obj to primitive



        String s1="100";
        String s2="200";

        System.out.println(s1+s2);  // it will be print only Value because it is String not interger

        int r=Integer.parseInt(s1);
        System.out.println(r);

        //  Integer ab=Integer.valueOf(s1);  it is Option
        //System.out.println(ab);

        int p=Integer.parseInt(s2);
        System.out.println(p);

        // Integer c=Integer.valueOf(s2);  it is Option
        // System.out.println(c);

        System.out.println(r+t);

    }
}
