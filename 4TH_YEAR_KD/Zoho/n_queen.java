// package Zoho;

import java.sql.Array;
import java.util.*;

public class n_queen {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        int n = 4;
        int[][] board = new int[n][n];
        for (int[] row : board)
            Arrays.fill(row,0);

        if(SolveNQ(board,0,n)){
            printSolution(board);
        }else{
            System.out.println("Solution does not exist");
        }
    }    

    public static boolean SolveNQ(int board[][] , int col,int n){
        if(col >= n){
            return true;
        }
        for(int i = 0; i < n;i++){
            if(isSafe(board,i,col)){
                board[i][col] = 1;

                if(SolveNQ(board, col+1, n)){
                    return true;
                }

                board[i][col] = 0;
            }
        }
        return false;
    }


    public static boolean isSafe(int board[][], int row,int col){
        int i,j;
        for(i = 0; i < col;i++){
            if(board[row][i] == 1)
                return false;
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;
  
        for (i = row, j = col; j >= 0 && i < board.length; i++, j--)
            if (board[i][j] == 1)
                return false;
  
        return true;
    }
    public static void printSolution(int[][] board){
        for(int i = 0; i < board.length;i++){
            for(int j = 0; j < board.length;j++){
                if(board[i][j] == 1)
                    System.out.print(" Q ");
                else    
                    System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }

    }
}
