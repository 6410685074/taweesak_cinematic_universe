
public class CountOne {
    public static void main(String[] args) {
        int[][]a={{1,0,0,0},{1,1,1,0},{1,1,0,0},{1,0,0,0}};
        int count=CountOne1(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0;j<a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
               
        }
        System.out.println(count); 
    }

    public static int CountOne1(int[][]a){
        int low=0;
        int height=a.length-1;
        int mid=(low+height)/2;
        int count=0;
        for (int i = 0; i < a.length; i++) {
            while(low<=height){
                if(a[i][mid]<0){
                    low=mid+1;
                }
                else{
                    count++;
                    height=mid-1;
                }
            }
        }
        return count;
    }    
}
