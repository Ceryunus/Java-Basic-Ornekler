import java.util.Scanner;

public class HavuzProblemi {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);

		System.out.print("1.musluk havuzu ne kadarda dolduruyor ? : ");
		double h1 = scn.nextInt();
		System.out.print("2.musluk havuzu ne kadarda dolduruyor ? : ");
		int h2 = scn.nextInt();
		
		double result=(1d/((1d/h1)+(1d/h2))); // 1/yapýlan is + 1/yapýlan is 2 * t = 1 Formülü  
		System.out.println("havuz "+result+" saatte dolar.");
		

		
		
	}
}
