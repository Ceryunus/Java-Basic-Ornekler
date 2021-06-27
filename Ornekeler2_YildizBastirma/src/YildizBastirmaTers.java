import java.util.Iterator;
import java.util.Scanner;

public class YildizBastirmaTers {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Bir sayi giriniz : ");
	int a = input.nextInt();
	int b = a;
	for (int i = 0; i < a; i++) {
		for (int j = b; j<a+1 && j>0 ; j--) {
			System.out.print("*");
		}
		b--;
		System.out.println("");
	}
	
	
	
	
	
	
	
}
}
