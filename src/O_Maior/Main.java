package O_Maior;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer a, b, c, maior;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		maior = (a + b + Math.abs(a - b)) / 2;
		maior = (maior + c + Math.abs(maior - c)) / 2;
		System.out.println(maior + " eh o maior");
		scan.close();
	}
}
