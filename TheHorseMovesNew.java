import java.util.Scanner;

public class TheHorseMovesNew {
	static void horseMoves(char[][] a, int x, int y) {
		if(x>a.length-1 || y>a[0].length-1 || x<0 || y<0){
			return;
		}		
		if(a[x][y]=='X'){
			return;
		}
			a[x][y]='X';			
		
		horseMoves(a, x-2, y-1);
		horseMoves(a, x-2, y+1);
		horseMoves(a, x-1, y-2);
		horseMoves(a, x-1, y+2);
		horseMoves(a, x+1, y-2);
		horseMoves(a, x+1, y+2);
		horseMoves(a, x+2, y-1);
		horseMoves(a, x+2, y+1);
	}
	
	static void printArray(char[][] a) {
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				System.out.print("| "+a[r][c]+" ");
			}
			System.out.println("|");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		int cols = 0;
		int horseRow = 0;
		int horseCol = 0;		
		do {
			System.out.println("Enter the number of the rows: ");
			rows = sc.nextInt();
			System.out.println("Enter the number of the cols: ");
			cols = sc.nextInt();
			System.out.println("Enter the coordinates of the first position: ");
			horseRow = sc.nextInt();
			horseCol = sc.nextInt();
		} while (rows < 0 && cols < 0 && horseRow < 0 && horseCol < 0 && horseRow >= rows && horseCol >= cols);
		
		char[][] horseMovesArray = new char[rows][cols];
		horseMoves(horseMovesArray, horseRow, horseCol);
		printArray(horseMovesArray);
		sc.close();
	}

}
