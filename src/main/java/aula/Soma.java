package aula;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number01;
		int number02;
		int soma;
		
		System.out.print("Entre com o Primeiro Numero: ");
		number01 = input.nextInt();
		
		System.out.print("Entre com o Segundo Numero: ");
		number02 = input.nextInt();
		
		soma = number01 + number02;
		
		System.out.printf("A soma é igual: %d", soma);
		input.close();
	}

}
