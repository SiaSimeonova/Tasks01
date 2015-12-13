
public class Problem20 {
	
//	Да се състави програма, чрез която се извежда квадрат от цифри. 
//	Сумите от елементите на произволен ред или стълб са	равни на 45.

	public static void main(String[] args) {
	
		for(int step=0; step<=9;step++){
			for(int f = step+1; f<=9; f++){
				System.out.print(f+" ");
			}
			for(int s=0;s<=step;s++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
