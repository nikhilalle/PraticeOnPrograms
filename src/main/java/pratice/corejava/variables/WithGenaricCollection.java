package pratice.corejava.variables;

import java.util.ArrayList;

public class WithGenaricCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(50);
        //list.add("Alle");(Compile time checking of its type) not Add Because Its type is Integer Can't Add String Value

        ArrayList<String> str = new ArrayList<>();
        str.add("Shri");
        str.add("Nikhil");
        //str.add(20);(Compile time checking of its type) not Add Because Its type is String  Can't Add Integer Value

        ArrayList<Character> ch=new ArrayList<>();
        ch.add('N');
        ch.add('I');
        ch.add('K');
        ch.add('H');
        ch.add('I');
        ch.add('L');


        for (Integer in : list) {
            System.out.println(in);
        }

        for (String st : str) {
            System.out.println(st);

        }
        for (Character chart:ch){
            System.out.println(chart);

        }
    }
}


