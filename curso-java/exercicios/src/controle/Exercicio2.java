package controle;

import java.util.Scanner;

// Criar um programa que informa se o ano é um ano bissexto.

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);
		
		if (bissexto == true) {
			System.out.println(ano + " é bissexto!");
		} else {
			System.out.println(ano + " não é bissexto!");
		}
		
		entrada.close();
	}
}
