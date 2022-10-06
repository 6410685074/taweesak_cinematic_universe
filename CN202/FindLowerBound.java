public class findLowerBound {
    public static void main(String[] args) {
        int[]a={1,3,5,7,9,11};
        int x=3;
        System.out.println(FindLowerBound(x, a));
        
    }
    public static int FindLowerBound(int x,int[]a){
        if(a[a.length-1]<x){
            return -1;
        }
        if(a[0]>=x){
            return 0;
        }
        else {
            int low=0;
            int height=a.length-1;
            int mid=0;
            while(low<=height){
                mid=(int)((low+height)/2);
                if(a[mid]<x&&a[mid+1]>=x&&mid!=a.length-1){
                    return mid+1;
                }
                if(mid!=0&&a[mid]>=x&&a[mid-1]<x){
                    return mid;
                }
                else if(a[mid]<x){
                    low=mid+1;
                }
                else if(a[mid]>x){
                    height=mid-1;
                }
                
                
            }
            return 0;
        }
    }
}
