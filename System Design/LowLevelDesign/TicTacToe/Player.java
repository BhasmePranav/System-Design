package LowLevelDesign.TicTacToe;

public class Player {

    String name;
    Character symbol;

    public Player(String name, Character symbol)
    {
        this.name = name;
        this.symbol = symbol;
    }

    public String getName()
    {
        return name;
    }

    public Character getSymbol()
    {
        return symbol;
    }
}
