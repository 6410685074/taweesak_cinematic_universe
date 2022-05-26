import java.util.Arrays;
public class Array2D {
    public static int sumElement(int[][] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
        }
        return sum;
    }
    public static boolean isSquare(int[][] a){
        boolean g=true;
        int c=a.length;
        for(int i=0;i<a.length;i++){
            if(c!=a[i].length){
                g=false;
                break;
            }
        }
        return g;
    }
    public static int[] flatten(int [][] a){
        int countElements=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                countElements++;
            }
        }
        int [] b=new int[countElements];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[k++]=a[i][j];
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(sumElement(a));
        System.out.println(isSquare(a));
        System.out.println(Arrays.toString(flatten(a)));
    }
}
