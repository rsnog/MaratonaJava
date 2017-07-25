package Lanche;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(new Locale("us", "US"));
		Scanner scan = new Scanner(System.in);
		Map<Integer, Float> cardapio = new TreeMap<Integer, Float>();
		Integer a, b;
		float total;
		cardapio.put(1, (float) 4.00);
		cardapio.put(2, (float) 4.50);
		cardapio.put(3, (float) 5.00);
		cardapio.put(4, (float) 2.00);
		cardapio.put(5, (float) 1.50);
		a = scan.nextInt();
		b = scan.nextInt();
		total = cardapio.get(a) * b;
		System.out.printf("Total: R$ %.2f\n", total);
		scan.close();
	}
}
