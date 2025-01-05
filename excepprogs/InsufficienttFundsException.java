package excepprogs;

public class InsufficienttFundsException extends Exception{
    private double amount;
    public InsufficienttFundsException(double amount){
        this.amount = amount;
    }
}
