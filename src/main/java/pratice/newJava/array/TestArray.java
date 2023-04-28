package pratice.newJava.array;

public class TestArray {
    public static void main(String[] args) {
        int [] no={12,20,34,98,45,89};

        String [] str={"Shri","Nikhil","Rohit","Pratham","Shruti"};

         //Using For-Each Loop
        System.out.println("Using ForEach Loop");

        for (String st:str) {
            System.out.println("String Names : "+st);

        }

        for (int a:no) {
            System.out.println("Numbers  :"+a);

        }

        // Using For Loop
        System.out.println("Using For Loop");

        for (int i=0;i<=no.length;i++){
            System.out.println(no[i]);
        }

        for (int k=0;k<=str.length;k++){
            System.out.println(str[k]);
        }
    }
}
