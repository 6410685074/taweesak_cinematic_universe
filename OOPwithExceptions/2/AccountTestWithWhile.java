import java.util.Scanner;
public class AccountTestWithWhile {
    public static void main(String[] args) {
    BanckAccountWithEx MR_a=new BanckAccountWithEx(1000.0);
    BanckAccountWithEx MR_b=new BanckAccountWithEx(0.0);
    BanckAccountWithEx MR_c=new BanckAccountWithEx(0.0);
    Scanner sc=new Scanner(System.in);
    while(true){
        System.out.println("Hello user welcome to AAA_BANK");
        System.out.printf("hi Mr_a \n");
        System.out.println("Enter 0 to check status");
        System.out.println("Enter 1 to deposite");
        System.out.println("Enter 2 to withdraw");
        System.out.println("Enter 3 to transfer");
        System.out.println("Enter 4 to logout");
        String a=sc.nextLine();
        if(a.equals("0")){
            System.out.println(MR_a);
            System.out.println("your money ="+Double.toString(MR_a.getBalance())+"\n"+"your transactioncount :"+Integer.toString(MR_a.gettranscationcount()));
        }
        else{
        if(a.equals("1")){
            System.out.println("enter amount to deposite");
            int amount=sc.nextInt();
            MR_a.deposite(amount);
        }
        if(a.equals("2")){
            System.out.println("enter amount to withdraw");
            int amount=sc.nextInt();
            MR_a.withdraw(amount);
        }
        if(a.equals("3")){
            System.out.println("transfer to account");
            System.out.println("MR_B= 1");
            System.out.println("MR_C=2");
            String b=sc.nextLine();
            if(b.equals("1")){
                System.out.println("enter amount to transfer");
                int amount=sc.nextInt();
                MR_a.transfer(MR_b, amount);
            }
            else{if(b.equals("2")){
                System.out.println("enter amount to transfer");
                int amount=sc.nextInt();
                MR_a.transfer(MR_c, amount);
            }
            else{
                System.out.println("error no such an account\n pls try agian");
            }
        }
            
            }
        }
        if(a.equals("4")){
            System.out.println("thank you");
            break;
        }
        
    }
    }
    
}