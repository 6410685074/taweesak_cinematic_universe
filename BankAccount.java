public class BankAccount{
    private double balance;
    public BankAccount(double initialbalance){
        this.balance=initialbalance;
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
    }
    public void withdraw(double amount){
        this.balance=this.balance-amount;
    }
    public void transfer(double amount,BankAccount another){
        this.balance=this.balance-amount;
        another.balance=another.balance+amount;
    }
    public double getBalance(){
        return this.balance;
    }
}