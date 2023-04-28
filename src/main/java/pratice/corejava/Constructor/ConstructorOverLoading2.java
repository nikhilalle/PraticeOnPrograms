package pratice.corejava.Constructor;

public class ConstructorOverLoading2 {
    int iD;
    int floor;
    String name;
    String company;
    float rank;
    ConstructorOverLoading2(int iD, int floor){
        this.iD=iD;
        this.floor=floor;
        System.out.println("Id No:"+iD);
        System.out.println("Which Floor :"+floor);

    }
    ConstructorOverLoading2(String name, String company){
        this.name=name;
        this.company=company;
        System.out.println("Name:"+name);
        System.out.println("Company Name :"+company);
    }
    ConstructorOverLoading2(String name, float rank){
        this.name=name;
        this.rank=rank;
        System.out.println("Name:"+name);
        System.out.println("Rank :"+rank);
    }
    ConstructorOverLoading2(int iD, String name){
        this.iD=iD;
        this.name=name;
        System.out.println("Id No:"+iD);
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        new ConstructorOverLoading2(101,5);
        new ConstructorOverLoading2("Shri","Wipro");
        new ConstructorOverLoading2("Nikhil",9);
        new ConstructorOverLoading2(201,"Pratham");
        System.out.println("-----------------");
        new ConstructorOverLoading2(105,10);
        new ConstructorOverLoading2("Harika","Wipro");
        new ConstructorOverLoading2("Anil",5);
        new ConstructorOverLoading2(701,"Prajakta");
    }

}
