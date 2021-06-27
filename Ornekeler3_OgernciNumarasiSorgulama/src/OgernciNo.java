import java.util.Scanner;

public class OgernciNo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Öðrenci nosunu giriniz : ");
	String no=input.nextLine();
	
	if(no.length()>7) {
		System.out.println("Bu kadar büyük öðrenci nosunu girenezsiniz !!!");
	}
	else if (no.charAt(0)=='0') {
		System.out.println("Öðrenci nosunu 0 ile baþlayamaz !!");
	}
	else {
		System.out.println("Öðrenci no : "+no);
	}
	
	
}
	
	
}
