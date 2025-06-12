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
		
		
	}
	
	//For printing the board when players take turns
	public static void printBoard() {
		System.out.println(" ----------");
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 3; j++){
			    System.out.print(" | ");
			}
			System.out.println();
			System.out.println(" ----------");
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
	
	
}