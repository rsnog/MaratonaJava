package Pares_e_Ímpares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();

		int entradas = scan.nextInt();

		for (int i = 0; i < entradas; i++) {
			int valor = scan.nextInt();
			if (valor % 2 == 0) {
				par.add(valor);
			} else {
				impar.add(valor);
			}
		}

		Collections.sort(par);
		Collections.sort(impar);

		for (Integer r : par) {
			System.out.println(r);
		}
		
		for (int i = impar.size()-1; i >=0; i--) {
			System.out.println(impar.get(i));
		}

		scan.close();
	}
}
