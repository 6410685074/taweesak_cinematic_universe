/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excerise;

/**
 *
 * @author augus
 */
public class FindFixedPoint {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int[]a={9,10,11,12,13,14,15,16,17,18};
        boolean b=FindFixedPoint1(a);
        System.out.println(b);
    }
    public static boolean FindFixedPoint1(int[]a){
        //binary search
        int low=0;
        int height=a.length-1;
        int mid=0;
        while(low<=height){
            mid=(low+height)/2;
            if(a[mid]==mid){
                return true;
                    }
            else if(a[mid]>mid){
                height=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    return false;
    }
    
}
