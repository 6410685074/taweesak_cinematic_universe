public class BanckAccountWithEx {
    private double balance;
    private int transcationcount=0;
    private final double transcationFee=30.0;
    public BanckAccountWithEx(){
        this(1000.0);
    }
    public BanckAccountWithEx(double amount){
        this.balance=amount;
    }
    public void deposite(double amount){
        balance=balance+amount;
        transcationcount++;
    }
    public double getBalance(){
        return balance;
    }
    public int gettranscationcount(){
        return transcationcount;
    }
    public void withdraw(double amount){
        try{
        if(transcationcount>=3){
            if(balance<transcationFee+amount){
                throw new IndexOutOfBoundsException();
            }
            else{
                balance=balance-transcationFee-amount;
                System.out.println("your money ="+Double.toString(getBalance())+"\n"+"your transactioncount :"+Integer.toString(gettranscationcount()));
            }
        }
        
        else{if(balance<amount){
            throw new ArithmeticException();
        }
        balance=balance-amount;
        }
        transcationcount++;

    }catch(IndexOutOfBoundsException e){
        System.out.println("not enough money need:"+Double.toString(transcationFee+amount));
        System.out.println("your money ="+Double.toString(getBalance()));
    }catch(ArithmeticException e){
        System.out.println("not enough money need:"+Double.toString(amount));
        System.out.println("your money ="+Double.toString(getBalance()));
    }

    }
    public void transfer(BanckAccountWithEx e,double amount){
        withdraw(amount);
        e.deposite(amount);
    }
    public String toString(){
        
        return "";
    }
}
