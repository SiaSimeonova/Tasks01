
public class Problem05 {

	// Да се състави програма, при която предварително са въведени естествени числа в двумерен масив 4*4 елемента.
	// Програмата да извежда резултат от проверката какво е съотношението на най-голямата сума по редове спрямо 
	// най-голямата сума по колони.
	// Пример:
	// 1,2,3,4
	// 5,6,7,8
	// 9,10,11,12
	// 13,14,15,16
	// Изход:
	// най-голяма сума по редове 58
	// най-голяма сума по колони 40
	// Максималната сума по редове е > от максималната сума по колони
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }, };
		int maxR = 0;
		int maxC = 0;
		int cTemp = maxC;
		int rTemp = maxR;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a[0].length; c++) {
				maxR += a[r][c];
			}
			if (maxR > rTemp) {
				rTemp = maxR;
				maxR = 0;
			} else {
				maxR = 0;
			}
		}
		System.out.println("Най-голямата сума по редове е: " + rTemp);

		for (int c = 0; c < a.length; c++) {
			for (int r = 0; r < a[0].length; r++) {
				maxC += a[r][c];
			}
			if (maxC > cTemp) {
				cTemp = maxC;
				maxC = 0;
			} else {
				maxC = 0;
			}
		}
		System.out.println("Най-голямата сума по колони е: " + cTemp);
		String ch = (rTemp > cTemp) ? ">" : "<";
		System.out.println("Най-голямата сума по редове е " + ch + " от най-голямата сума по колони.");
	}

}
