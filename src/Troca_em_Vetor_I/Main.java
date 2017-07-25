package Troca_em_Vetor_I;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux;
		int[] vetor = new int[20];
		for (int i = 0; i < 20; i++) {
			vetor[i] = scan.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			aux = vetor[19 - i];
			vetor[19 - i] = vetor[i];
			vetor[i] = aux;
		}
		for (int j = 0; j < 20; j++) {
			System.out.println("N[" + j + "] = " + vetor[j]);
		}
		scan.close();
	}
}
