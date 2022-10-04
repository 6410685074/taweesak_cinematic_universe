/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excerise;

/**
 *
 * @author augus
 */
import java.util.Scanner;
public class find_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[]a={1,2,3,4,5,6,7,8,9,10};
        int z=scan.nextInt();
        boolean b=find_sum1(a,z);
        System.out.println(b);
    }
    public static boolean find_sum1(int[] a,int z){
        for(int i=0;i<a.length;i++){
            int low=0;
            int height=a.length-1;
            int mid=0;
            while(low<=height){
                mid=(height+low)/2;
                if(a[mid]+a[i]==z){
                    return true;
                }
                else if(a[mid]+a[i]<z){
                    low=mid+1;
                }
                else{
                    height=mid-1;
                }
            }
        }
        return false;
    }
    
}
