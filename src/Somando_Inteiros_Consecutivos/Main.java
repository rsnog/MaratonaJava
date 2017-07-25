package Somando_Inteiros_Consecutivos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Integer a, n, s = 0;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		do {
			n = scan.nextInt();
		} while (n < 1);
		for (int i = 0; i < n; i++) {
			s += a;
			a++;
		}
		System.out.println(s);
		scan.close();
	}
}
