import java.util.Scanner;
public class SigmoidFonksiyonu {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	double x = scn.nextDouble();
	double SigmodFunction=1/(1+Math.E-x);
	System.out.println("Sigmoid Function result = "+SigmodFunction);
}
}
