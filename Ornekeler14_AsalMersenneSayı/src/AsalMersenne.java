
public class AsalMersenne {
public static void main(String[] args) {
	int sayac = 1;

	for (int i = 3; sayac <= 1000000; i++) {//i= ardaþýk sayilar

		for (int j = 2; j < i; j++) {//i den önce olan sayilar

			if (i % j == 0) {//i ye i den önce bölünen sayila varsa hiç uðraþma geç
				break;
			}

			if (i == j + 1) {//i==j(yani i ) ise iþlem bitti :!
				for (int z = 1;; z++) {
					if(((Math.pow(2, z))-1)>i) {
						break;
					}
					else if (((Math.pow(2, z))-1)==i) {
						System.out.println((sayac)+". "+i + " Asal Mersennedir");
						break;
						
					}
					
				}
				
				
				

				sayac++;
				break;
			}

		}

	} 
}
}
