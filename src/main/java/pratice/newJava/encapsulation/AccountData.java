package pratice.newJava.encapsulation;

public class AccountData {
    private  String name;
    private int accountNo;
    private  int balance;
// Getter Method
    public String getName(){
        return name;
    }
    public int getAccountNo(){
        return accountNo;
    }
    public int getBalance(){
        return balance;
    }
    /**This a POJO class with only getter & setter methods.
            *  This is a Tightly Encapsulated class i.e. all the data members of this class is declared as private.
            */
// Setter Method
    public void setName(String name){
        this.name=name;
    }
    public void setAccountNo(int accountNo){
        this.accountNo=accountNo;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }

    public static void main(String[] args) {


    }
}
