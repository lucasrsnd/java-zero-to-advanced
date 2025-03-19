package controle;

import java.util.Scanner;

// Refatorar o exercício 04, utilizando a estrutura switch.

public class Exercicio5 {

	public static void main(String[] args) {
		
		int contDivisor = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contDivisor++;
			}
		}

		switch (contDivisor) {

		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;

		default:
			System.out.println("O numero " + numero + "  não é um numero primo.");

		}

		scanner.close();

	}
}
