import java.util.Scanner;

public class prob7_1 {
    public static boolean checkString(int x,String s){
        if((s!=null)&&(s.length()>=4)&&(s.indexOf('e')==-1)&&(s.length()==x)){
            return true;
        }
        else
            return false;
    }
    public static void main(String [] args){
        
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int x=sc.nextInt();
    System.out.println(checkString(x, s));
    
    }
    
}

