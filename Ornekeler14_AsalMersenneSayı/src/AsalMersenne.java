
public class AsalMersenne {
public static void main(String[] args) {
	int sayac = 1;

	for (int i = 3; sayac <= 1000000; i++) {//i= arda��k sayilar

		for (int j = 2; j < i; j++) {//i den �nce olan sayilar

			if (i % j == 0) {//i ye i den �nce b�l�nen sayila varsa hi� u�ra�ma ge�
				break;
			}

			if (i == j + 1) {//i==j(yani i ) ise i�lem bitti :!
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
