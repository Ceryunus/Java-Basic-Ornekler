import java.util.Scanner;

public class ObebFinder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Ebobu alýnacak 1. sayiyi giriniz ! : ");
		int a = scn.nextInt();
		System.out.print("Ebobu alýnacak 2. sayiyi giriniz ! : ");
		int b = scn.nextInt();

		int bigger;
		int result = 1;
		if (a < b) {
			bigger = a;

		} else {
			bigger = b;
		}

		for (int i = 2; i < bigger + 1;) {

			if (a % i == 0 && b % i == 0 || a % i == 1 && b % i == 1) {
				result *= i;
				System.out.print("result : "+result);
				a /= i;
				b /= i;
				if (a == 1 || b == 1) {
					break;
				}
			} else {
				i++;
				System.out.println(i);
			}

		}
		System.out.println("Sonuç : " + result);

	}
}
