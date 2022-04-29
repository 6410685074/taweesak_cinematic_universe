import java.sql.Time;

public class prub7_3 {
    public static void main(String[] args) {
        TIme t=new TIme(2234);
        System.out.println(t);
        System.out.println("hour is :"+t.getHour());
        System.out.println("Min is :"+t.getMin());
        t.adjustTimeAfter(4, 48);
        System.out.println(t);
        t.adjustTimeBefore(15, 40);
        System.out.println(t);
    }    
}
