
public class Problem12 {
	
//	Да се създаде метод, който приема за входни данни число N и връща масив от числа с дължина N, който съдържа 
//	всички числа от 1 до N.
	
	static int [] arrayUppToN(int n){
		int [] a = new int [n];
		for(int i=0;i<a.length;i++){
			a[i]=i+1;
		}
		return a;
	}

	public static void main(String[] args) {
		int [] a = arrayUppToN(1157);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

// Ne moga da si obiasnia, zashto moje da printira samo do 1157????
