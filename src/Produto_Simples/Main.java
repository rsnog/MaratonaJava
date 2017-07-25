package Produto_Simples;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor1, valor2, prod;
		Scanner scan = new Scanner(System.in);
		valor1 = scan.nextInt();
		valor2 = scan.nextInt();
		prod = valor1 * valor2;
		System.out.println("PROD = " + prod);
		scan.close();
	}

}
