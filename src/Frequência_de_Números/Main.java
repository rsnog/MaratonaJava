package Frequência_de_Números;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, v;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] lista1 = new int[n];
		for (int i = 0; i < n; i++) {
			lista1[i] = scan.nextInt();
		}
		Arrays.sort(lista1);
		for (int i = 0; i < n; i++) {
			v = 1;
			for (int j = i + 1; j < n; j++) {
				if (lista1[i] == lista1[j]) {
					v++;
					i++;
				}
			}
			System.out.println(lista1[i] + " aparece " + v + " vez(es)");
		}
		scan.close();
	}
}
