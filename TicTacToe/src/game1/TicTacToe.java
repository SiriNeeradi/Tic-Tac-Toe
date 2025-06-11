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
		printboard();
		
	}
	
	//For printing the board when players take turns
	public static void printboard() {
		System.out.println(" ----------");
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 3; j++){
			    System.out.print(" | ");
			}
			System.out.println();
			System.out.println(" ----------");
		}
	}
	
}