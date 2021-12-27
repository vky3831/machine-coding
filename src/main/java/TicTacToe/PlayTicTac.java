package TicTacToe;

public class PlayTicTac {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setId(1);
        p1.setName("Albertssss");
        p1.setSymbol('X');

        Player p2 = new Player();
        p2.setId(2);
        p2.setName("Pintosssss");
        p2.setSymbol('O');
        Player[] players = new Player[]{p1,p2};
        GameBoard gb = new GameBoard(3,players);
        gb.startGame();
    }
}