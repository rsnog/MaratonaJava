package Crescente_e_Decrescente;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		while ((x = scan.nextInt()) != (y = scan.nextInt())) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
		}

		scan.close();
	}
}
