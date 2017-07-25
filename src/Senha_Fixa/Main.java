package Senha_Fixa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int senha=2002, teste;
		do {
			teste=scan.nextInt();
			if (teste!=senha) {
				System.out.println("Senha Invalida");
			}else{
				System.out.println("Acesso Permitido");
			}
		} while (teste!=senha);
		
		scan.close();
	}
}
