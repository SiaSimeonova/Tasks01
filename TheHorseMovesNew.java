import java.util.Scanner;

public class TheHorseMovesNew {
	
	static void horseMoves(char[][] a, int x, int y, int counter) {
		if(x>a.length-1 || y>a[0].length-1 || x<0 || y<0){
			return;
		}
		if(counter==a.length*a[0].length){
			return;
		}
		if(a[x][y]=='X'){
			return;
		}else{
			a[x][y]='X';
			counter++;
		}
		horseMoves(a, x-2, y-1, counter);
		horseMoves(a, x-2, y+1, counter);
		horseMoves(a, x-1, y-2, counter);
		horseMoves(a, x-1, y+2, counter);
		horseMoves(a, x+1, y-2, counter);
		horseMoves(a, x+1, y+2, counter);
		horseMoves(a, x+2, y-1, counter);
		horseMoves(a, x+2, y+1, counter);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 0;
		int cols = 0;
		int horseRow = 0;
		int horseCol = 0;
		int counter=0;
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
		horseMoves(horseMovesArray, horseRow, horseCol, counter);
		for (int r = 0; r < horseMovesArray.length; r++) {
			for (int c = 0; c < horseMovesArray[0].length; c++) {
				System.out.print("| "+horseMovesArray[r][c]+" ");
			}
			System.out.println("|");
		}
		sc.close();
	}
}
