import java.util.Scanner;

public class CodingSystemNew {
	
	static String encript (char [][] matrix, String text ){
		String encriptedText =" ";
		int row1=0;
		int col1=0;
		int row2=0;
		int col2=0;
		for(int index=0;index<text.length();index+=2){
			for(int row = 0; row<5; row++){
				for(int col = 0; col<5; col++){
					if(text.charAt(index)==matrix[row][col]){
						row1=row;
						col1=col;
					}
					if(text.charAt(index+1)==matrix[row][col]){
						row2=row;
						col2=col;
					}
				}
			}
			if(row1==row2 && col1 == col2){
				
			}
			if(row1==row2 && col1!=col2){
				if(col1==4){
					col1=0;
				}else{
					col1++;
				}
				if(col2==4){
					col2=0;
				}else{
					col2++;
				}
			}
			if(col1==col2 && row1!=row2){
				if(row1==4){
					row1=0;
				}else{
					row1++;
				}
				if(row2==4){
					row2=0;
				}else{
					row2++;
				}
			}
			if(col1!=col2 && row1!=row2){
				int temp=col1;
				col1=col2;
				col2=temp;
			}
			char firstLetter = matrix[row1][col1];
			char secondLetter = matrix[row2][col2];
			encriptedText=encriptedText+firstLetter+secondLetter;
		}
		
		return encriptedText;
	}
	
	static String decript (char [][] matrix, String text ){
		String decriptedText =" ";
		int row1=0;
		int col1=0;
		int row2=0;
		int col2=0;
		for(int index=0;index<text.length();index+=2){
			for(int row = 0; row<5; row++){
				for(int col = 0; col<5; col++){
					if(text.charAt(index)==matrix[row][col]){
						row1=row;
						col1=col;
					}
					if(text.charAt(index+1)==matrix[row][col]){
						row2=row;
						col2=col;
					}
				}
			}
			if(row1==row2 && col1 == col2){
				
			}
			if(row1==row2 && col1!=col2){
				if(col1==0){
					col1=4;
				}else{
					col1--;
				}
				if(col2==0){
					col2=4;
				}else{
					col2--;
				}
			}
			if(col1==col2 && row1!=row2){
				if(row1==0){
					row1=4;
				}else{
					row1--;
				}
				if(row2==0){
					row2=4;
				}else{
					row2--;
				}
			}
			if(col1!=col2 && row1!=row2){
				int temp=col1;
				col1=col2;
				col2=temp;
			}
			char firstLetter = matrix[row1][col1];
			char secondLetter = matrix[row2][col2];
			decriptedText=decriptedText+firstLetter+secondLetter;
		}
		
		return decriptedText;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [][] matrix = {{'B','M','S','J','C'} ,
				            {'I','F','N','T','E'} ,
				            {'R','L','A','H','K'} ,
				            {'D','O','G','Q','V'} ,
				            {'U','W','X','Y','P'}};
			System.out.println("Please enter a text: ");
			String text = sc.nextLine();
			text=text.toUpperCase();
			int length = text.length();
			if(text.length()%2!=0){
				text=text.concat("P");
			}
			String encriptedText= encript (matrix, text );
			encriptedText=encriptedText.trim();
			System.out.println(encriptedText);
			String decriptedText= decript (matrix, encriptedText );
			decriptedText=decriptedText.trim();
			decriptedText=decriptedText.substring(0,length);
			System.out.println(decriptedText);
			sc.close();
		}
}


