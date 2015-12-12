import java.util.Scanner;

public class TicTacToeNew {

	static boolean move(char[][] a, int x, int y, char character, int counter) {
		a[x][y] = character;
		boolean isWinner = false;
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.print("| " + a[row][col]);
			}
			System.out.println("|");
		}
		if (counter > 4) {
			int countChar = 0;
			for (int i = 0; i < 3; i++) {
				if (a[i][y] == character) {
					countChar++;
				}
				if (countChar == 3) {
					isWinner = true;
				}
			}
			countChar = 0;
			for (int i = 0; i < 3; i++) {
				if (a[x][i] == character) {
					countChar++;
				}
				if (countChar == 3) {
					isWinner = true;
				}
			}
			if (a[0][0] == character && a[1][1] == character && a[2][2] == character) {
				isWinner = true;
			}
			if (a[0][2] == character && a[1][1] == character && a[2][0] == character) {
				isWinner = true;
			}
		}
		return isWinner;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] ticTacToe = new char[3][3];
		int row1 = 0;
		int col1 = 0;
		int counter = 0;
		char character = ' ';
		boolean winner = false;
		while (counter < 9) {
			if (!winner) {
				do {
					System.out.println("1: ");
					row1 = sc.nextInt() - 1;
					col1 = sc.nextInt() - 1;
				} while (row1 > 2 || row1 < 0 || col1 > 2 || col1 < 0 || (ticTacToe[row1][col1] != '\u0000'));
				counter++;
				if (counter % 2 == 0) {
					character = 'O';
				}
				if (counter % 2 != 0) {
					character = 'X';
				}
				winner = move(ticTacToe, row1, col1, character, counter);
			} else {
				if (character == 'X') {
					System.out.println("1 is the winner!!!");
					break;
				}
				if (character == 'O') {
					System.out.println("2 is the winner!!!");
					break;
				}
			}
		}
		if (!winner) {
			System.out.println("It is a tie!");
		}
		sc.close();
	}
}
