package pratice.corejava.interFace;

public interface Vehicle {
    String name="Nikhil";
    void mileage();
    void speed();
    void model();
    void colour();

    /**
     * Interface abstract methods cannot have body
     *  Normal Method Not Accepted Due to Interfce has  100% abstraction
     *  non  abstraction not Allowed in Interface
     *  We can not create an Object of interface
     *  i.e Vehicle obj=new Vehicle (not Possible in Interface)
     *  Interface is a mechanism to achieve the abstraction
     * We can achieve 100% abstraction by interface
    public void bike(){
        System.out.println("I am in Inerface Class");
     */

}
