import javax.print.DocFlavor.READER;

public class nQueens {
    public static boolean isSafe(char chessBoard[][],int row,int col){
        //vertical up
     for(int i=row-1;i>=0;i--){
        if(chessBoard[i][col]=='Q'){
            return false;
        }
     }

        //digonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        //diagonal up right
        for(int i=row-1,j=col+1;i>=0&&j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
             return false;
            }
        }
        return true;
    }
    public static boolean Nqueens(char chessBoard[][],int row){
        if(row==chessBoard.length){
          //  printBoard(chessBoard);
          count++;
            return true;
        }
        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j]='Q';
            if(Nqueens(chessBoard, row+1)){
                return true;
            }
            chessBoard[row][j]='x';
            }
            
        }
        return false;
    }
    public static void printBoard(char chessBoard[][]){
        System.out.println("----chess board----");
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count=0;

    public static void main(String[]args){
        int n=5;
        char chessBoard[][]=new char[n][n];

        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                chessBoard[i][j]='x';
            }
        }
       if(Nqueens(chessBoard, 0)){
        System.out.println("solution is possible");
        printBoard(chessBoard);
       }else{
        System.out.println("solution is not possible");
       }
        
        System.out.println("total number of ways="+count);
    }
}