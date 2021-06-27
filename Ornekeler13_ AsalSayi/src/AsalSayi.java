
public class AsalSayi {
	public static void main(String[] args) {
		int sayac = 1;
		System.out.println((sayac)+". 2" + " Asaldir");
		sayac++;
		for (int i = 3; sayac <= 20; i++) {//i= ardaþýk sayilar

			for (int j = 2; j < i; j++) {//i den önce olan sayilar

				if (i % j == 0) {//i ye i den önce bölünen sayila varsa hiç uðraþma geç
					break;
				}

				if (i == j + 1) {//i==j(yani i ) ise iþlem bitti :!
					System.out.println((sayac)+". "+i + " Asaldir");
					sayac++;
					break;
				}

			}

		} /*
			 * int say=2; int sinir=16; while (true) { if (say==sinir) { break; }
			 * 
			 * System.out.println(say); say++; } for (int i = 2; i < 20; i++) {
			 * System.out.println(i); }
			 */
	}
}
