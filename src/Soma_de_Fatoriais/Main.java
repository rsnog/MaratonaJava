package Soma_de_Fatoriais;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		String v1 = null, v2 = null;
		Integer n1, n2, soma, fat;
		while (!(v1 = leitor.readLine()).equals("") && !(v2 = leitor.readLine()).equals("")) {
			n1 = Integer.parseInt(v1);
			n2 = Integer.parseInt(v2);
			if((n1<0 || n1>20) || (n2<0 || n2>20)){
				break;
			}
			soma = 0;
			fat = 1;
			for (int i = 1; i <= n1; i++) {
				fat = fat * i;
			}
			soma = soma + fat;
			fat = 1;
			for (int i = 1; i <= n2; i++) {
				fat = fat * i;
			}
			soma = soma + fat;
			System.out.println(soma);
		}
	}
}
