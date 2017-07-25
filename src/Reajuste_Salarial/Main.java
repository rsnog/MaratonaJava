package Reajuste_Salarial;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("us", "US"));
		Float salario, nSalario, dSalario;
		Integer percentual;
		Scanner scan = new Scanner(System.in);
		salario = scan.nextFloat();
		if (salario >= 0 && salario <= 400) {
			percentual = 15;
		} else if (salario > 400 && salario <= 800) {
			percentual = 12;
		} else if (salario > 800 && salario <= 1200) {
			percentual = 10;
		} else if (salario > 1200 && salario <= 2000) {
			percentual = 7;
		} else {
			percentual = 4;
		}
		nSalario = salario + ((salario * percentual) / 100);
		dSalario = nSalario - salario;
		System.out.printf("Novo salario: %.2f\n", nSalario);
		System.out.printf("Reajuste ganho: %.2f\n", dSalario);
		System.out.println("Em percentual: " + percentual + " %");
		scan.close();
	}
}
