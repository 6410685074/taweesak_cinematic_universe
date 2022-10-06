import java.util.Arrays;
import java.util.Scanner;
public class findlargestK{

    public static void main(String [] args){
        int[] a={5,15,27,29,35,42};
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println(Arrays.toString(a));
        int[] b=new int[a.length];
        int c=0;
        for (int i = 0; i <a.length; i++) {
            if(i<k){
                b[i]=a[a.length-k+i];
            }
            else{
                b[i]=a[i-k];
            }
        }
        System.out.println(Arrays.toString(b));
        int ans=findlargestK(a);
        System.out.println(ans);
        
    }
    public static int findlargestK(int[]a){
        int low=0;
        int height=a.length-1;
        int mid=(int)((low+height)/2);
        while(low<=height){
                mid=(int)((low+height)/2);
                if(a[mid]<a[height]){
                    low=mid+1;
                }
                else{
                    height=mid-1;
                }
        }
        
        return a[mid];
    }
}
