package controle;

import java.util.Scanner;

// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par.

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}
		
		if (numero <= 10 && numero >= 0) {
			System.out.println("O número está entre 0 e 10.");
		} else {
			System.out.println("O número não está entre 0 e 10.");
		}
		
		entrada.close();
	}
}
