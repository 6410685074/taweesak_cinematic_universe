public class Myclass {
    private static int x=4;
    private int y;
    private int z;
    public Myclass(){
        this(1,1);
    }
    public Myclass(int a,int b){
        boolean c=false;
        if(c=a==b){
            y=x+=2-3;
        }
        else{
            y=x-=2+3;
        }
        z=y+2;
    }
    public void display(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public void first(int y,int z){
        y++;
        --z;
    }
    public void second(int y){
        x=y+++7;
        z=x-y;
    }
    public static void third(Myclass mc,int z){
        mc.second(z);
        mc.display();
    }
    public void start(){
        first(x,y);
        display();
        second(z);
        display();
        Myclass mc=new Myclass();
        display();
        third(mc, z);
    }

}
