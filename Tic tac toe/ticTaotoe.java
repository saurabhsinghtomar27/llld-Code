import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class ticTaotoe {
    Deque<Player> players;
    Board board;
  public void intializeBoard() {
    players=new LinkedList<>();
      PiecesX crossX = new PiecesX();
      Player player1 = new Player("player1", crossX);
      PiecesO crossO = new PiecesO();
        Player player2 = new Player("player2", crossO);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }
    public String startGame(){
        boolean noWinner=true;
        while(noWinner){
            Player currentPlayer = players.poll();
            board.printBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if(freeCells.isEmpty()){
                noWinner=false;
                continue;
            }
            System.out.print("Player:" + currentPlayer.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
  ;   String s = inputScanner.nextLine();            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            boolean isAdded = board.addPiece(inputRow, inputColumn, currentPlayer.getPlayingPieces());
            if(!isAdded){
                System.out.println("Incorrect possition chosen, try again");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean isWinner = checkWinner(inputRow,inputColumn,currentPlayer.getPlayingPieces());
            if(isWinner){
                noWinner=false;
                return currentPlayer.name;
            }
        }
        return"tie";
    }
    public boolean checkWinner(int row, int column, PlayingPieces playingPiece){
        boolean isWinner = true;
        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] != playingPiece) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            return true;
        }
        isWinner = true;
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][column] != playingPiece) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            return true;
        }
        isWinner = true;
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][i] != playingPiece) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) {
            return true;
        }
        isWinner = true;
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][board.size - i - 1] != playingPiece) {
                isWinner = false;
                break;
            }
        }
        return isWinner;
    }
  }

