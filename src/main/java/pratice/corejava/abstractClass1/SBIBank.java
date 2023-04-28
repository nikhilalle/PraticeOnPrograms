package pratice.corejava.abstractClass1;

public class SBIBank extends RBIBank{

    @Override
    void fixDeposit() {
        System.out.println("     FixDeposit  ");
        System.out.println(account_No);
        System.out.println(balance);
        System.out.println("---------------------");

    }

    @Override
    void carLoan() {
        System.out.println("     carLoan  ");
        System.out.println(account_No);
        System.out.println(balance);
        System.out.println("---------------------");
    }

    @Override
    void bikeLoan() {
        System.out.println("  Bike Loan  ");
        System.out.println(account_No);
        System.out.println(balance);
        System.out.println("---------------------");
    }

    @Override
    public void getDetails() {
        System.out.println("  Get  Details   ");

        System.out.println(account_No);
        System.out.println(balance);
        System.out.println("---------------------");

    }

    public static void main(String[] args) {
        RBIBank rbi=new SBIBank();
        rbi.carLoan();
        rbi.bikeLoan();
        rbi.fixDeposit();
        rbi.getDetails();


    }



    }

