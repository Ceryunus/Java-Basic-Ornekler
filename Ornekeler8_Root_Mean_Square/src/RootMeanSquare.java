import java.util.Scanner;
/*Bir dizi alarak bu say�lar�n RMS (Root Mean Square) bulan kodu yaz�n�z. 
 * RMS: Bilgisayar bilimlerinde �e�itli istatistik ve hesaplama alanlar�nda kullan�lan bir form�ld�r.
 *  Basit�e �� a�amadan olu�ur: De�erlerin karelerini al (square) , 
 * kareleri al�nan bu de�erlerin ortalamas�n� al (mean) ,
 *  bu ortalama de�erinin karek�k�n� al (root)*/
public class RootMeanSquare {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double mean = 0;
		double result=0;
		System.out.println("Kac elemanli bir dizi olsun ? : ");
		int arraySize= scn.nextInt();
		int[] a = new int[arraySize];
		for (int i = 0;i<arraySize; i++) {
			System.out.print((i+1)+". Elemani giriniz : ");
			a[i]=scn.nextInt();
			
			
		} 
		
		for (int i = 0; i < a.length; i++) {
			a[i]=a[i]*a[i];
			mean+=a[i];
			System.out.println(a[i]);
		}
		mean/=arraySize;
		result=Math.pow(mean,(1d/2));
		System.out.println(result);
	}

}
