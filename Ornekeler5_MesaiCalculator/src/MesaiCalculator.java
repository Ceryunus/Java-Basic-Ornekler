import java.util.Scanner;

public class MesaiCalculator {
	public static void MesaiHesapla(int ucret, int saat) {
		System.out.println("Alacağınız mesai ücreti : "+(ucret*saat));
	}
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("Ne kadar mesaiye kaldınız ? : ");
		int mesai=scn.nextInt();
		if(mesai >=100) {
			MesaiHesapla(5, mesai);
		}
		else if(mesai>=40) {
			MesaiHesapla(4, mesai);
		}
		else if(mesai>=30) {
			MesaiHesapla(3, mesai);
		}
		else if(mesai>=20) {
			MesaiHesapla(2, mesai);
		}
		else if(mesai>=10) {
			MesaiHesapla(1, mesai);
		}
		else if(mesai<=0) {
			System.out.println("Lütfen geçerli bir mesai saati giriniz !");
		}
		else {
			System.out.println("Lütfen geçerli bir mesai saati giriniz !");

		}
		
		
	}

}
