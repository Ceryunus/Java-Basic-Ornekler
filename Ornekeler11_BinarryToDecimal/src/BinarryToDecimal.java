import java.util.Scanner;

public class BinarryToDecimal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String binarry=scn.next();
		int a = binarry.length();
		int k=0;
		int pow=0;
		double result = 0;
		for (int i = a-1; i !=-1; i--) {
			k=Character.getNumericValue(binarry.charAt(i));
			if (k==0) {
				result+=(int) (k*Math.pow(2, pow));
				pow++;
			}
			else {
				result+=(int) (k*Math.pow(2, pow));
				pow++;
			}
		}
		System.out.println("2Tabanýnda "+binarry+" = "+" 10Tabanýnda "+result);
		
		
		 /*//String yada Char olarak girilen sayilari Integer e cevirme !
		char b ='1';
		int k =0;
		int j =0;
		k=Integer.valueOf(a);
		j=Character.getNumericValue(b);
		System.out.println(k);
		System.out.println(j);*/
		
	}
}
