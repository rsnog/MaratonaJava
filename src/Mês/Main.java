package Mês;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String v[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };
		int num = scan.nextInt();
		System.out.println(v[num - 1]);
		scan.close();
	}
}
