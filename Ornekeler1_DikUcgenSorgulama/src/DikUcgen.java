import java.util.Scanner;

public class DikUcgen {

	public static void  Sorgula(int a, int b, int c) {
		if((a*a)+(b*b)==(c*c)) {
			System.out.println("Son� : Dik ��gendir.");
		}
		else {
			System.out.println("Son� : Dik ��gen de�ildir!");	
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. dik Kenar� giriniz : ");
		int a = input.nextInt();
		System.out.println("2. dik Kenar� giriniz : ");
		int b = input.nextInt();
		System.out.println("Hipoten�s� giriniz : ");
		int c = input.nextInt();		
		Sorgula(a, b, c);
	}
	
	
	
	
	
}
