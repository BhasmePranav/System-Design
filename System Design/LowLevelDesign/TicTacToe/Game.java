package LowLevelDesign.TicTacToe;

import java.util.Scanner;

public class Game {

    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;


    public Game(Player player1, Player player2)
    {
        board = new Board(3);
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
    }
    
    private boolean winner = false;
    
    
    public void startGame()
    {
        while(winner != true)
        {
            makeMove();
        }
    }
    public void makeMove()
    {
        System.out.println(currentPlayer.getName()+" turn : ");
        System.out.println("Enter row number between 0 to 2 (inclusive): ");
        Integer row = getMoveLocation();
        System.out.println("Enter column number between 0 to 2 (inclusive): ");
        Integer column = getMoveLocation();
        board.setCell(row, column, currentPlayer.getSymbol());
        board.showBoard();
        
        if(isWinner(currentPlayer , board)) 
        {
            System.out.println("Winner is  : "+currentPlayer.getName()+"  "+currentPlayer.getSymbol());
            winner = true;
        }
        if(currentPlayer == player1)    currentPlayer = player2;
        else currentPlayer = player1;
    }


    public static int getMoveLocation()
    {
        Scanner sc = new Scanner(System.in);
        Integer number = sc.nextInt();
        return number;
    }

    public static boolean isWinner(Player currentPlayer , Board board)
    {
        Character symbol = currentPlayer.getSymbol();
        String name = currentPlayer.getName();
        
        for(int i = 0;i<board.length;i++)
        {
            if(board.getCell(i, 0) == symbol && board.getCell(i, 1) == symbol && board.getCell(i, 2) == symbol)    return true;
        }
        return false;
    }
    
    
}
