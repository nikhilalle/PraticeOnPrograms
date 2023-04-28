package pratice.newJava.array;

public class Array {
    public void m1(int [] ar,String [] str){
        for (int i:ar) {
            System.out.println("Marks :"+i);
        }
        for (String s:str)
        {
            System.out.println("Name :"+s);
        }
    }

    public static void main(String[] args) {
        Array obj=new Array();
        int [] xy={10,20,30,40,50};
        String [] zy={"Shri","Nikhil","Pratham","Shruti","Harika"};
        obj.m1(xy,zy);
    }

}
