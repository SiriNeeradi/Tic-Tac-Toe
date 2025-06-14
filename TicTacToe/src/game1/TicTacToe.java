package game1;
import java.util.*;
public class TicTacToe {
	
	//3X3 board which should take char input either X or O
	static char board[][] = {
			{' ',' ',' '},
			{' ',' ',' '},
			{' ',' ',' '}
	};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char currentPlayer = 'X'; 		//Player1 = X
		boolean gameStarted = true;		//Game initializer
		System.out.println("Welcome to tic tac toe!");
		printBoard();
		
		while(gameStarted) {
			System.out.println("Player " + currentPlayer + " Enter your move rows[1-3] & columns[1-3]");
			int rows = sc.nextInt() - 1;
			int cols = sc.nextInt() - 1;
			
			if(board[rows][cols] != ' ' || rows > 2 || cols > 2 || rows < 0 || cols < 0) {
				System.out.println("Invalid Move.. Try Again");
			}else {
				board[rows][cols] = currentPlayer;
				printBoard();
				
				if (hasWon(currentPlayer)) {
					System.out.println("Player "+ currentPlayer + " is the winner");
					gameStarted = false;
				}
				
				else if (isDraw()) {
					System.out.println("It's a Draw.. Nobody is a winner.. Play again");
					gameStarted = false;
				}else {
					currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
				}
			}
					
		}
		
		
	}
	
	//For printing the board when players take turns
	public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
	}
	
	//Winning cases for a player
	public static boolean hasWon(char player) {
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
			else if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;
        return false;
	}
	
	//When all rows and columns are filled then its a draw
	public static boolean isDraw() {
		for(int i = 0 ; i <= 2  ; i++) 
			for(int j = 0 ; j <= 2 ; j++) 
				if(board[i][j] == (' ')) {
					return false;
				}
		return true;		
	}
}