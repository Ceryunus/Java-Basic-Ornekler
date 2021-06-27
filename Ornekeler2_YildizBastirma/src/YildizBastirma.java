import java.util.Scanner;

public class YildizBastirma {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Yildiz sayisini giriniz : ");
		int a = input.nextInt();
		for(int i=0;i<=a;i++) {
			
			for(int z=0;z<i;z++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
	
	}

}
