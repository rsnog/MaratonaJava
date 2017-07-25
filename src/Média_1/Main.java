package Média_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("us", "US"));
		Double nota1, nota2, media;
		Scanner scan = new Scanner(System.in);
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		media = ((nota1 * 3.5) + (nota2 * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f\n", media);
		scan.close();
	}
}
