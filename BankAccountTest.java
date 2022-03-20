public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount somchaiAcc=new BankAccount(10000);
        BankAccount somwongAcc=new BankAccount(1000);
        somchaiAcc.deposit(50000.0);
        somchaiAcc.transfer(30000.0,somwongAcc);
        somwongAcc.withdraw(25000.0);
        System.out.println(somchaiAcc.getBalance());
        System.out.println(somwongAcc.getBalance());
    }
    
}
