package excepprogs;

public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount();
        System.out.println("depositing 1000 Rs");
        c.deposit(1000);

        try{
            System.out.println("withdrawing Rs 400");
            c.withdraw(7000);
        }
        catch(InsufficienttFundsException e)
        {
            System.out.println(e);
        }
    }
}
