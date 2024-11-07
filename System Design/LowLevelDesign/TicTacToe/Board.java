package LowLevelDesign.TicTacToe;

import java.util.Arrays;

public class Board {

    Character[][] board;
    Integer n;
    public int length;
    
    public Board(Integer n)
    {
        this.n = n;
        board = new Character[n][n];
        startingBoard(board);
    }


    public static void startingBoard(Character[][] board)
    {
        for(Character[] arr : board)
        {
            Arrays.fill(arr , '-');
        }
    }

    public void showBoard()
    {
        for(Character[] arr : board)
        {
            for(Character x : arr)
            {
                System.out.print(x+"  ");
            }
            System.out.println();
        }
    }

    public void setCell(Integer row , Integer column , Character symbol)
    {
        board[row][column] = symbol;
    }

    public Character getCell(Integer row , Integer column)
    {
        return board[row][column];
    }
    
}
