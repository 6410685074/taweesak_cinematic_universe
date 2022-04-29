import java.util.Scanner;
public class prob7_2 {
    public static void main(String[] args) {
        String a=args[0];
        String b=args[1];
        char c=b.charAt(0);
        int x=a.indexOf(c);
        String d=(x!=-1)?a.substring(x+1):null;
        int y=(d==null)?-1:d.indexOf(c);
        System.out.println(x+y+1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.substring(x+1));
    }
}
