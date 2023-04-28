package pratice.newJava.encapsulation;

public class AccountDetails {
    public static void main(String[] args) {
        AccountData ac=new AccountData();
        /*ac.accountNo();  can not  access/Hides due to accountNo is private variables so,
        * private variable outside the  class can not used  ie : Data Hiding
        */

        ac.setBalance(655767);
        System.out.println("From Getter Method  Balance : "+ac.getBalance());
        ac.setAccountNo(768789 );
        System.out.println("From Getter Method  Account No : "+ac.getAccountNo());
        ac.setName("Shri");
        System.out.println("From Getter Method  Name : "+ac.getName());

    }
}

