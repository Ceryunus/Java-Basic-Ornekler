import java.util.Scanner;
/*Verilen bir say�n�n hiperbolik tanjant�n� veren kodu yaz�n�z .*/
public class Hiperbolik_Tanjant_MathKutuphanesi {
public static void main(String[] args) {
	Scanner scn =new Scanner(System.in);
	System.out.print("Sayiyi giriniz : ");
	double i = scn.nextDouble();
	System.out.println(Math.tanh(i));
	


}
}
