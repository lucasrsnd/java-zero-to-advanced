package controle;

import java.util.Scanner;

// Criar um programa que receba um número e diga se ele é um número primo.

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		int numero = entrada.nextInt();
		
		int contDivisor = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contDivisor++;
			}
		}
		
		if (contDivisor == 0) {
			System.out.println("O número " + numero + " é primo.");
		} else {
			System.out.println("O número " + numero + " não é primo.");
		}
		
		entrada.close();
	}
}
