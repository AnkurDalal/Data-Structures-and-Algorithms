public class GridWays {
    public static int gridWays(int i,int j,int n,int m){
        //base condititon
        if(i==n-1 && j==m-1){
            return 1;
        }else if (i==n || j==m) {
            return 0;
        }

        int ways1=gridWays(i, j+1, n, m);
        int ways2=gridWays(i+1, j, n, m);
        return ways1+ways2;
    }
    public static void main(String []args){
        int n=3;int m=3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
