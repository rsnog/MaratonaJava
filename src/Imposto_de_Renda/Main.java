package Imposto_de_Renda;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("us", "US"));
		double salario;
		double imposto = 0;
		Scanner scan = new Scanner(System.in);
		salario = scan.nextFloat();
		if (salario > 4500)
			imposto += (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		else if (salario > 3000)
			imposto += (salario - 3000) * 0.18 + 1000 * 0.08;
		else if (salario > 2000)
			imposto += (salario - 2000) * 0.08;
		if (imposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f\n", imposto);
		}
		scan.close();
	}
}
