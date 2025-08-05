package tic_tac_toe;

import java.util.*;

public class Board {
	
	final char[][] board;
	
	public Board()
	{
		board = new char[3][3];
		for(char[] a : board)
		{
			Arrays.fill(a, '.');
		}
	}
	
	
	public boolean checkWinner()
	{
		for(int i = 0;i<3;i++)
		{
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2])	return true;
			if(board[0][i] == board[1][i] && board[1][i] == board[2][i])	return true;
		}
		
		if(board[0][0] == board[1][1] && board[1][1] == board[2][2])	return true;
		if(board[0][2] == board[1][1] && board[1][1] == board[2][0])	return true;
		
		return false;
		
	}
	
	public void showBoard()
	{
		System.out.println("\n\n");
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print(board[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
	}

	public boolean updatePosition(int r, int c, char symbol)
	{
		if(board[r-1][c-1] == '.')
		{
			board[r-1][c-1] = symbol;
			return true;
		}
		return false;
	}

}
