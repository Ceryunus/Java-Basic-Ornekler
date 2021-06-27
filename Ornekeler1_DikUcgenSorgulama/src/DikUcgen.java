import java.util.Scanner;

public class DikUcgen {

	public static void  Sorgula(int a, int b, int c) {
		if((a*a)+(b*b)==(c*c)) {
			System.out.println("Sonç : Dik üçgendir.");
		}
		else {
			System.out.println("Sonç : Dik üçgen deðildir!");	
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. dik Kenarý giriniz : ");
		int a = input.nextInt();
		System.out.println("2. dik Kenarý giriniz : ");
		int b = input.nextInt();
		System.out.println("Hipotenüsü giriniz : ");
		int c = input.nextInt();		
		Sorgula(a, b, c);
	}
	
	
	
	
	
}
