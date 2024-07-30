public class SpiralMatrix {
    public static void printSpiral(int matrix[][]){
        int sr=0;
        int sc=0;
        int er=3;
        
        int ec=3;

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc;j<=ec;j++){
                System.out.print(matrix[sr][j]+" ");
            }
            //right
            for(int i=sr+1;i<=er;i++){
                System.out.print(matrix[i][ec]+" ");
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                System.out.print(matrix[er][j]+" ");
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                if(sc==ec){
                    break;
                }
                System.out.print(matrix[i][sc]+" ");
            }
            sc++;
            sr++;

            ec--;
            er--;

        }
        System.out.println();
    }
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }else if (i+j==matrix.length-1) {
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int optimizedDiagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[]args){
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
                   printSpiral(matrix);
    System.out.println(diagonalSum(matrix));
    System.out.println(optimizedDiagonalSum(matrix));
    }
}
