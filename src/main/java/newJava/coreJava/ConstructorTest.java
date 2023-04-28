package newJava.coreJava;

public class ConstructorTest {
    public void get(){
        System.out.println("i  am Nikhil");
    }
    public void set(){
        System.out.println("i  am Pooja");
    }
    public void ket(){
        System.out.println("i  am Suvi");
    }
    public static void main(String[] args) {
        ConstructorTest st=new ConstructorTest();
        st.get();
        st.ket();
        st.set();
    }
}
