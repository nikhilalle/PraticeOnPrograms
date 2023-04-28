package pratice.newJava.interfaceJava;

public interface InterfaceTest1 {
    String empName="Nikhil";

    void get1();

    void get2();

    /* Compiler internally will convert this interface like below.
        public static final String empName = "Nikhil";

        public abstract void get1();
        public abstract void get2();
        public abstract void get3();

    */
    void get3();
}
