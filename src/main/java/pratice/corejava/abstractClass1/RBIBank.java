package pratice.corejava.abstractClass1;

public   abstract   class RBIBank {
    long account_No=892345768;
    int balance=23500;

    public void details(){
        System.out.println(account_No);
        System.out.println(balance);
    }
    abstract void fixDeposit();
    abstract void carLoan();
    abstract void bikeLoan();
    public  abstract void getDetails();
}
