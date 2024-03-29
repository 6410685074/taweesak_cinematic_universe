public class CountOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] a = {{1, 0, 0, 0}, {1, 1, 1, 0}, {1, 1, 0, 0}, {1, 0, 0, 0}};
        int count = CountOne(a);
        System.out.println(count);
    }

    public static int CountOne(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            int low = 0;
            int height = a.length - 1;
            int mid =0;
            while (a[i][0] == 1 && (low <= height)) {
                mid = (int)((height + low) / 2);
                if(a[i][a.length-1]==1){
                    count=count+1*(a.length);
                    break;
                }
                if(a[i][mid]==1&&a[i][mid+1]==0){
                    count=count+1*(mid)+1;
                    break;
                }
                if(a[i][mid]==0){
                    height=mid-1;
                }
                if(a[i][mid]==1&&a[i][mid+1]==1){
                    low=mid+1;
                }
                System.out.println(count);
            }
        }
        return count;
    }

}