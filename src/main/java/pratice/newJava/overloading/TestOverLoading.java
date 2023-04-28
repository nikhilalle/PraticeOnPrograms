package pratice.newJava.overloading;

public class TestOverLoading {
    public void set(int roll,String name){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);
    }
    public void set(String name,int roll){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);
    }
    public void set(String comp,String name){
        System.out.println("Roll No :"+comp);
        System.out.println("Name :"+name);
    }
    public void set(int roll,int marks){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+marks);
    }
    public void set(int roll,char div,String name){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+name);
        System.out.println("Division :"+div);
    }
    public void set(int roll,float per){
        System.out.println("Roll No :"+roll);
        System.out.println("Name :"+per);
    }
    public void set(double d,char gread,char rollClass){
        System.out.println("Roll No :"+d);
        System.out.println("Name :"+gread);
        System.out.println("Class :"+rollClass);
    }

    public static void main(String[] args) {
        TestOverLoading obj=new TestOverLoading();
        obj.set(101,"Shri");
        obj.set(103,987);
        obj.set(101,98.56f);
        obj.set(100000,'A','A');

        obj.set("TCS","Nikhil");
        obj.set(102,'B',"Shrti");
        obj.set("nikhil",50);
    }

}
