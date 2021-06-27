import java.util.Scanner;
/*Bir dizi alarak bu sayýlarýn RMS (Root Mean Square) bulan kodu yazýnýz. 
 * RMS: Bilgisayar bilimlerinde çeþitli istatistik ve hesaplama alanlarýnda kullanýlan bir formüldür.
 *  Basitçe üç aþamadan oluþur: Deðerlerin karelerini al (square) , 
 * kareleri alýnan bu deðerlerin ortalamasýný al (mean) ,
 *  bu ortalama deðerinin karekökünü al (root)*/
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
