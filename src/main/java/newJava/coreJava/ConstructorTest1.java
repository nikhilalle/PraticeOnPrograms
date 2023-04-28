package newJava.coreJava;

public class ConstructorTest1 {
    public  ConstructorTest1(){
        System.out.println(" I am in Constructor   ");

    }
    public  ConstructorTest1(int a){
        System.out.println(" I am in Constructor   ");

    }
    public  ConstructorTest1(char a){
        System.out.println(" I am in Constructor   ");

    }
    public void get(char  e){
        System.out.println("i  am Nikhil");
    }
    public void get(int a){
        System.out.println("i  am Nikhil");
    }
    public static void main(String[] args) {
        ConstructorTest1 st=new ConstructorTest1();
        st.get(23);
    }
}
