package pratice.corejava.Constructor;

public class ConstrutorOverLoading {
    String name;
    String place;
    int date;
    ConstrutorOverLoading(String name, String place, int date)
    {
        this.name=name;
        this.place=place;
        this.date=date;
        System.out.println("Name :"+name);
        System.out.println("City :"+place);
        System.out.println("Date Of Birth :"+date);
    }
    ConstrutorOverLoading(String name, String place){
        this.name=name;
        this.place=place;
        System.out.println("Name :"+name);
        System.out.println("District :"+place);

    }
    ConstrutorOverLoading(int date){
        this.date=date;
       // this.place=place;
        System.out.println("Date :"+date);
       // System.out.println("District :"+place);

    }
    ConstrutorOverLoading(String name, int date)
    {
        this.name=name;
        this.date=date;
        System.out.println("Name :"+name);
        System.out.println("Date Of Birth :"+date);
    }

    public static void main(String[] args) {
        new ConstrutorOverLoading("Shri","Pune",29);
        new ConstrutorOverLoading("Nikhil","Solapur",18);
        new ConstrutorOverLoading("Pratham","Solapur",18);
        new ConstrutorOverLoading("Anil","Solapur");
        new ConstrutorOverLoading("Nagesh","Solapur");
        new ConstrutorOverLoading("solapur",23);
        new ConstrutorOverLoading(11);
    }
}
