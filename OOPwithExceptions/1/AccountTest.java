public class AccountTest {
    public static void main(String[] args) {
    BanckAccountWithEx a=new BanckAccountWithEx(2000.0);
    BanckAccountWithEx b=new BanckAccountWithEx();
    a.withdraw(500);
    System.out.println(a.getBalance());
    a.withdraw(500);
    System.out.println(a.getBalance());
    a.withdraw(500);
    System.out.println(a.getBalance());
    a.withdraw(500);
    System.out.println(a.getBalance());
    a.tranfer(b, 500.0);
    System.out.println(a.gettranscationcount());
    }
        
    
}
