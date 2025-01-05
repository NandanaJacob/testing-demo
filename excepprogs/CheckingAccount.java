package excepprogs;

public class CheckingAccount {
    private double balance;

    public void deposit(double amount){
        balance+=amount;
        System.out.println("balance is now " +balance);
    }

    public void withdraw(double amount) throws InsufficienttFundsException{
        if(amount<=balance){
            balance-=amount;
            System.out.println("balance is now "+balance);
        }
        else{
            double needs = amount-balance;
            System.out.println("needs = "+needs);
            throw new InsufficienttFundsException(needs);
            //define it in another class
        }
    }
    //we wanna monitor exception in withdraw()
    //we can do this using throw =>allows to create user defined exception
}
