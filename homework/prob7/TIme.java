
public class TIme {
    private int Min,Hour;
    public TIme(int a){
    Min=Integer.parseInt(Integer.toString(a).substring(2,4));
    Hour=Integer.parseInt(Integer.toString(a).substring(0,2));
}   
    public int getMin(){
        return this.Min;
    }
    public int getHour(){
        return this.Hour;
    }
    public void adjustTimeAfter(int hour,int min){
        Min=Min+min;
        Hour=Hour+hour;
        if(Min>=60){
            Hour=Hour+(int)Min/60;
            Min=Min%60;
        }
        if(Hour>=24){
            Hour=Hour%24;
        }
        
    }
    public void adjustTimeBefore(int hour,int min){
        Min=Min-min;
        Hour=Hour-hour;
        
        if(Min<0){
            Min=Min+60;
            Hour=Hour-1;
        }
        if(Hour<0){
            Hour=24+Hour;
        }
    }
    public String toString(){
        return Integer.toString(Hour)+":"+Integer.toString(Min);
    }
}
