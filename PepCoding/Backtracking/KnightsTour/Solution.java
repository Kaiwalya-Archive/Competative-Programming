package PepCoding.Backtracking.KnightsTour;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] chess = new int[n][n];
        KnightsTour(chess, row, col, 1);//Passes the information to find the tour of knight

    }

    /*This function finds the tour of the knight*/
    public static void KnightsTour(int[][] chess, int row, int col, int move){
        if(row<0||col<0||row>=chess.length||col>=chess.length||chess[row][col]!=0){

            return;//If the cell no goes out of the board or already visited

        }else if(move == chess.length*chess.length){//This is the last step

            chess[row][col] = move;//creates move last time & Marks it visited
            displayChessBoard(chess);//Prints the board and the tour of the knight
            chess[row][col] = 0;//Marks it unvisited
            return;

        }


        /*This takes the main recursion calls*/
        chess[row][col] = move;
        KnightsTour(chess, row-2,col+1,move+1);
        KnightsTour(chess, row-1,col+2,move+1);
        KnightsTour(chess, row+1,col+2,move+1);
        KnightsTour(chess, row+2,col+1,move+1);
        KnightsTour(chess, row+2,col-1,move+1);
        KnightsTour(chess, row+1,col-2,move+1);
        KnightsTour(chess, row-1,col-2,move+1);
        KnightsTour(chess, row-2,col-1,move+1);
        chess[row][col] = 0;
    }

    /*This prints the matrix with the route of the knight*/
    public static void displayChessBoard(int[][] ChessBoard){

        for(int i=0 ;i<ChessBoard.length; i++){

            for(int j=0; j<ChessBoard[0].length; j++){

                System.out.print(ChessBoard[i][j]+" ");

            }
            System.out.println();

        }

        System.out.println();

    }
}
