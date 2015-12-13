
public class Problem12 {
	
//	Да се състави програма, която извежда всички естествени трицифрени числа,
//	 които нямат еднакви цифри т.е. 100,101, 606 и т.н. не се извеждат.


	public static void main(String[] args) {
		for (int i = 123; i<=987; i++){
			int a=i%10;
			int b=(i/10)%10;
			int c=i/100;
			if(a!= b && b!=c){
				System.out.println(i);
			}else{
				continue;
			}
		}

	}

}
