package Tempo_de_Jogo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (b <= a) {
			b += 24;
		}
		System.out.println("O JOGO DUROU " + (b - a) + " HORA(S)");
		scan.close();
	}

}
