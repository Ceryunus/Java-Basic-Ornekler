import java.util.Scanner;

public class OgernciNo {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("��renci nosunu giriniz : ");
	String no=input.nextLine();
	
	if(no.length()>7) {
		System.out.println("Bu kadar b�y�k ��renci nosunu girenezsiniz !!!");
	}
	else if (no.charAt(0)=='0') {
		System.out.println("��renci nosunu 0 ile ba�layamaz !!");
	}
	else {
		System.out.println("��renci no : "+no);
	}
	
	
}
	
	
}
