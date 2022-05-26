import java.util.Scanner;

import javax.management.RuntimeErrorException;

import java.util.InputMismatchException;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        double sum;
        boolean f=false;
        try{
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        double d=Double.parseDouble(a);
        double e=Double.parseDouble(c);
            if(b.equals("+")){
                f=true;
                sum=d+e;
                System.out.println(sum);
            }
            if(b.equals("-")){
                f=true;
                sum=d-e;
                System.out.println(sum);
            }
            if(b.equals("*")){
                f=true;
                sum=d*e;
                System.out.println(sum);
                
            }
            if(b.equals("/")){
                f=true;
                if(e==0){
                    throw new ArithmeticException();
                }
                sum=d/e;
                System.out.println(sum);
                
            }
            else{ if(f==false)
                throw new IndexOutOfBoundsException(b);
            }
        }
        catch(NumberFormatException e){
            System.out.println("error input :"+e.getMessage().substring(17));

        }
        catch(ArithmeticException e){
            System.out.println("divide by zero");

        }
        catch(IndexOutOfBoundsException e){
            System.out.println("unimplemented operation:"+e.getMessage());
            
        }

    }
}