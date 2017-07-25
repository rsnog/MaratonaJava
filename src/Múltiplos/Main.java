package Múltiplos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int a, b;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
		scan.close();
	}
}
