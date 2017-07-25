package Fórmula_de_Báscara;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("us", "US"));
		double A, B, C;
		double R1 = 0, R2 = 0;
		Scanner scan = new Scanner(System.in);
		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();
		if (Math.pow(B, 2) - (4 * A * C) >= 0 && A != 0) {
			R1 = (-B + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
			R2 = (-B - Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A);
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		} else {
			System.out.printf("Impossivel calcular\n");
		}
		scan.close();
	}
}
