package tic_tac_toe;

import java.util.Scanner;

public class Game {
	
	Player player1;
	Player player2;
	Player currentPlayer;
	Board board;
	
	public Game(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.currentPlayer = player1;
		board = new Board();
		board.showBoard();
	}

	public void play()
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count < 9)
		{
			System.out.println(currentPlayer.name+" enter position :");
			int r = sc.nextInt();
			int c = sc.nextInt();
			while(r > 3 || c > 3)	
			{
				System.out.println("Please enter valid position");
				r = sc.nextInt();
				c = sc.nextInt();
			}
			boolean updated = board.updatePosition(r, c, currentPlayer.symbol);
			while(!updated)
			{
				System.out.println("Please enter valid position, its already filled.");
				r = sc.nextInt();
				c = sc.nextInt();
				updated = board.updatePosition(r-1, c-1, currentPlayer.symbol);
			}
			board.showBoard();
			count++;
			if(count >= 5)	
			{
				boolean winner = board.checkWinner();
				if(winner)
				{
					System.out.println(currentPlayer.name+". is winner !!!");
					break;
				}
			}
			currentPlayer = switchPlayer(currentPlayer, player1, player2);

		}
	}

	public Player switchPlayer(Player currentPlayer, Player player1, Player player2)
	{
		if(currentPlayer == player1)	return player2;
		else return player1;
	}
	
	

}
