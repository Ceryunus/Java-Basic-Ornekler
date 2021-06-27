import java.util.Iterator;
import java.util.Scanner;

public class OkekFinder {
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Okeki alinacak 1.sayi : ");
		int a = scn.nextInt();
		System.out.print("Okeki alinacak 2.sayi : ");
		int b = scn.nextInt();
		int result=1;
		
		for (int i = 2; i <= a+1 || i<=b+1;) {
			if(a%i==0 || b%i==0) {
				result*=i;
				System.out.println("result : "+result);
				if(a%i==0 && b%i==0) {
					a=a/i;
					b=b/i;
					System.out.println("1.girilen sayinin deðeri : "+a);
					System.out.println("2.girilen sayinin deðeri : "+b);
				}
				else if (a%i==0) {
					a=a/i;
					System.out.println("1.girilen sayinin deðeri : "+a);
					System.out.println("2.girilen sayinin deðeri : "+b);
				}
				else if (b%i==0) {
					b=b/i;
					System.out.println("1.girilen sayinin deðeri : "+a);
					System.out.println("2.girilen sayinin deðeri : "+b);
				}
							 
			}
			if(a%2==0 || b%i==0) {
				
				i=2;
				}
			else {
				i++;
				System.out.println("i nin deðeri : "+i);
			}
			

			
		}
		System.out.println("Sonuç : "+result);
		
	}

}
