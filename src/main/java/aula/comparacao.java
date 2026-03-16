package aula;

import java.util.Scanner;

public class comparacao {

	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		n1 = input.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		n2 = input.nextInt();
		
		if (n1 == n2) {
			System.out.print("n1 é igual a n2");
		} else if (n1 > n2) {
			System.out.print("n1 é maior a n2");
		} else if (n1 < n2) {
			System.out.print("n2 é maior a n1");
		} else if (n1 >= 10) {
			System.out.print("n1 é maior ouigual a 10");
		} else {
			System.out.print("Dados Invalidos");
		}
		
		input.close();

	}

}
