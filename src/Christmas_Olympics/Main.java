package Christmas_Olympics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean EOF = false;
		Set<String> pais = new TreeSet<>();
		ArrayList<String> pOuro = new ArrayList<>();
		ArrayList<String> pPrata = new ArrayList<>();
		ArrayList<String> pBronze = new ArrayList<>();
		//int ouro, prata, bronze;

		while (EOF == false) {
			for (int i = 1; i < 5; i++) {
				String entrada = scan.nextLine();
				if (entrada == null || entrada.equals("")) {
					EOF = true;
					break;
				}
				switch (i) {
				case 2:
					pais.add(entrada);
					pOuro.add(entrada);
					break;
				case 3:
					pais.add(entrada);
					pPrata.add(entrada);
					break;
				case 4:
					pais.add(entrada);
					pBronze.add(entrada);
					break;
				default:
					break;
				}
			}
		}

		ArrayList<Object> quadro = new ArrayList<>();

		for (String competidor : pais) {
			quadro.add(competidor);
			quadro.add(Collections.frequency(pOuro, competidor));
			quadro.add(Collections.frequency(pPrata, competidor));
			quadro.add(Collections.frequency(pBronze, competidor));
		}

		System.out.println("Quadro de Medalhas");
		for (Object object : quadro) {
			System.out.println(object);
		}

		scan.close();
	}
}
