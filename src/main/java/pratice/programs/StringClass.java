package pratice.programs;

public class StringClass {
    String name="Pooja";
    String surName="Dhavale";
    String name1="Nikhil";
    String name2="Pooja";


    public void stringElements(){
        System.out.println(name);
        System.out.println(surName);
        System.out.println(name1);

    }
    public void getString(){
        System.out.println(name.concat(surName));
        System.out.println(surName.concat(name));
        System.out.println(name.equals(surName));
        System.out.println(name.equals(name2));
        System.out.println(name==name2);
        System.out.println(name==surName);
        System.out.println(name.replace('P','N'));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replaceAll(name,name1));
        System.out.println(name.endsWith("Y"));
        System.out.println(name.endsWith("a"));
        System.out.println(name.startsWith("P"));
        System.out.println(name.startsWith("p"));
        System.out.println(name.replaceAll("Po","Ni"));
        System.out.println(name.replaceAll("oo","aa"));
    }

    public static void main(String[] args) {
        StringClass obj=new StringClass();
//obj.stringElements();
        obj.getString();
    }
}
