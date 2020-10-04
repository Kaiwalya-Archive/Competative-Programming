package PepCoding.Backtracking.N_QueensProblem;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }
    /*This function prints all the locations for queens to be placed for now that if one
     * queen kill the other queen or not*/

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if (row == chess.length) {
            System.out.println(qsf + ".");
            return;
        }
        /*This function:
         1.Change the location on the chess board
         2.Check if the location is safe for the queen to be placed
         3.If it is true marks the position of the queen
         4.and calls for recursion
         5.When the location on the chess board ends it starts returning and clearing the locations
         */
        for (int col = 0; col < chess.length; col++) {

            if (IsQueenSafe(chess, row, col) == true) {//Checks if queen is safe
                chess[row][col] = 1;//Marks the position of current queen in the chess board
                printNQueens(chess, qsf + row + "-" + col + ", ", row + 1);//After storing the location
                chess[row][col] = 0;//removes the position
            }

        }
    }

    public static boolean IsQueenSafe(int[][] chess, int row, int col) {
        /*Checks if it gets killed in upwards verticle rows*/
        for (int i = row - 1, j = col; i >= 0; i--) {
            if (chess[i][j] == 1) {
                return false;//If gets killed returns false
            }
        }

        /*Checks if it gets killed in left Diagonal*/
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;//If gets killed returns false
            }
        }

        /*Checks if it gets killed in right Diagonal*/
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;//If gets killed returns false
            }
        }
        return true;//If doesn't gets killed in any conditions then it returns true
    }

}
