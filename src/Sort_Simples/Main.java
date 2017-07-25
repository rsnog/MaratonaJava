package Sort_Simples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		List<Integer> lista1 = new ArrayList<Integer>();
		List<Integer> lista2 = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			lista1.add(scan.nextInt());
			lista2.add(lista1.get(i));
		}
		Collections.sort(lista1);
		for (Integer l1 : lista1) {
			System.out.println(l1);
		}
		System.out.println();
		for (Integer l2 : lista2) {
			System.out.println(l2);
		}
		scan.close();
	}
}
