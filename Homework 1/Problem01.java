import java.util.Scanner;

public class Problem01 {
	
//	Да се изведат съобщения към потребителя и да се прочетат 2 числа от
//	клавиатурата A и B (може да са с плаваща запетая – double).
//	После да се прочете 3-то число C и да се провери дали то е м/у A и B.
//	Да се изведе подходящо съобщение за това дали C е между A и B.

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two different numbers A and B.");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	System.out.println("Enter third number C");
	double c = sc.nextDouble();
		if(((a>c) && (c>b)) || ((a<c) && (c<b))){
			System.out.println("The third number C is betwin A and B.");
		}else{
			System.out.println("The third number C is not betwin A and B.");
		}
		sc.close();
	}

}

