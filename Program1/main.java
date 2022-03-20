import java.util.Scanner;
public class main {
    public static char encrypt(char ch){
        int numchar=(int)(ch);
        if(numchar>=65 &&numchar<=90){
            ch=Character.toLowerCase(ch);
            numchar=(int)(ch);
            numchar=(219-numchar);
            ch=(char)numchar;
            return ch;
        }
        else {
            if(numchar>=97&&numchar<=122){
            ch=Character.toUpperCase(ch);
            numchar=(int)(ch);
            numchar=(155-numchar);
            ch=(char)numchar;
            return ch;
            }
            if(numchar>=48&&numchar<=57){
            ch=Character.toUpperCase(ch);
            numchar=(int)(ch);
            numchar=(105-numchar);
            ch=(char)numchar;
            return ch;
             }
        }
    return ch;
    }
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        for (char ch:line.toCharArray()){
            System.out.println(encrypt(ch));
        }
    }    
}
