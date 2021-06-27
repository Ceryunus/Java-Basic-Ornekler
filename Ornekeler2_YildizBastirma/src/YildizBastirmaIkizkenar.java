import java.util.Iterator;
import java.util.Scanner;

public class YildizBastirmaIkizkenar {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	System.out.println("Bir sayi giriniz : ");
	int a=input.nextInt();
	int x =a;
	int z=1;
	for(int i = 0;i<a;i++) {
		for (int j = 0; j < x-1; j++) { //satýr sayýsýnýn bir eksigi kadar baþta boþluk býraktýrýyotrum
			System.out.print(" ");
		}
		x--;
		for (int t = 0; t <z ; t++) {  //1,3,5,7 þeklinde yýdýzlarý bastýrýyorum
			System.out.print("*");
		}
		z+=2;
		System.out.println("");
	
	}


	}
	
}
