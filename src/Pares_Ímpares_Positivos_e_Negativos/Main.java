package Pares_Ímpares_Positivos_e_Negativos;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int par = 0, impar = 0, positivo = 0, negativo = 0;
		int[] vetor = new int[5];
		for (int i = 0; i < 5; i++) {
			vetor[i] = scan.nextInt();
			if (vetor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			if (vetor[i] > 0) {
				positivo++;
			} else if (vetor[i] < 0) {
				negativo++;
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		scan.close();
	}
}
