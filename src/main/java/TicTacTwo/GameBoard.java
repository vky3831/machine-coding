package TicTacTwo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GameBoard {
    private char[][] board;
    private int boardsize;
    private Queue<Player> nextTurn;
    Scanner input;

    GameBoard(int boardsize, Player[] player){
        this.boardsize = boardsize;
        this.board = new char[boardsize][boardsize];
        initializeBoard(board);
        nextTurn = new LinkedList<>();
        for(int i=0; i<player.length; i++){
            nextTurn.offer(player[i]);
        }
        input = new Scanner(System.in);
    }

    private void initializeBoard(char[][] board) {
        for(int i=0; i<boardsize; i++){
            for(int j=0; j<boardsize; j++){
                board[i][j] = '-';
            }
        }
    }

    private void printBoard(){

        for(char[] row : board){
            for(char col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int i=0; i<boardsize; i++){
            for(int j=0; j<boardsize; j++){
                System.out.print("("+i+","+j+")"+" ");
            }
            System.out.println();
        }

    }

    public void start(){
        printBoard();
        int count=0;
        while(true){
            count++;
            if(count >= (boardsize*boardsize)+1) {
                System.out.println("Match draw");
                break;
            }
            Player pl = nextTurn.poll();
            Position pos = getUserInput();
            board[pos.x][pos.y] = pl.getSymbol();
            System.out.println("Board after move:");
            printBoard();
            if(count >= (2*boardsize)-1 && checkEndGame(pl, pos)) break;
            nextTurn.offer(pl);
        }

    }

    private boolean checkEndGame(Player pl, Position pos) {
        String winString = "";
        for(int i=0; i<boardsize; i++){
            winString += pl.getSymbol();
        }

        int x = pos.x;
        int y = pos.y;

        String rowString = "";
        String colString = "";
        String diagonalString = "";
        String revDiagonalString = "";
        for(int i=0; i<boardsize; i++){
            rowString += board[x][i];
            colString += board[i][y];

            if(x == y){
                diagonalString += board[i][i];
            }
            if((x+y) == boardsize-1){
                revDiagonalString += board[boardsize-1-i][i];
            }
        }
        if(winString.equals(rowString) || winString.equals(colString) || winString.equals(diagonalString) || winString.equals(revDiagonalString)) {
            System.out.println(pl.getName()+" has won the game");
            return true;}
        return false;
    }

    private Position getUserInput() {
        int[] xy = new int[2];
        do{
            System.out.println("Enter Coordinates: ");
            for(int i=0; i<2; i++){
                xy[i] = input.nextInt();
            }
        } while(!isValid(xy));

        return Position.builder().x(xy[0]).y(xy[1]).build();
    }

    private boolean isValid(int[] xy) {
        int x = xy[0];
        int y = xy[1];
        if(x < 0 || x >= boardsize || y < 0 || y>= boardsize){
            System.out.println("Coordinates out of board. Try again");
            return false;
        }
        if(board[x][y] != '-'){
            System.out.println("Coordinates already filled. Try again");
            return false;
        }
        return true;
    }
}