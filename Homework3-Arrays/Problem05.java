
public class Problem05 {
	
//	Напишете програма, която създава масив с 10 елемента и инициализира всеки от елементите със стойност
//	равна на индекса на елемента умножен по 3. Да се изведат елементите на екрана.

	public static void main(String[] args) {
		int [] a = new int [10];
		for(int i =0; i < a.length; i++){
			a[i] = i*3;
			System.out.print(a[i]+" ");	
		}
	}

}
