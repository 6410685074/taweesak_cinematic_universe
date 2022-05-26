
public class Mymain{
    public static void main(String[] args) {
        
        try{String a=args[0];
            String b=args[1];
            double ans=0;
            try{
            
            if(b.equals("0")){
                throw new NullPointerException();

            }
            else{
            
                int c=Integer.parseInt(a);
                int d=Integer.parseInt(b);
                ans=c/d;
            }
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println(ans);
        }
    }
        
        catch(Exception e){
            System.out.println("at exception");
        }
    }
}
