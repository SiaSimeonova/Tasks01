
public class Problem11 {
	
//	Да се създаде метод, който отпечатва масив в конзолата.
	
	static void printArrayInt (int [] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void printArrayString (String [] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void printArrayChar (char [] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] arrayInt = {7, 7, 3, 4, 5, 1, 0, 44, 59};
		String [] arrayString = {"gfgvbc", "ghdx" , "fdssd", "dgfs", "hdfgsd"};
		char [] arrayChar = {'t', 'r', 'e', 'q'};
		printArrayInt(arrayInt);
		printArrayString(arrayString);
		printArrayChar(arrayChar);
	}

}
