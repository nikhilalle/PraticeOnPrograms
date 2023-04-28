package pratice.newJava.interfaceJava;

public interface InterfaceTest2 {
    String companyName = "Capgmini";

    void test1();

    void test2();

    void test3();

    /* Compiler internally will convert this interface like below.
        public static final String companyName="Capgmini";

        public abstract void test1();;
        public abstract void test2();
        public abstract void test3();
        public abstract void stringp(String name);
        public abstract void intp(int a,int b);

    */
    void stringp(String name);

    void intp(int a, int b);


}
