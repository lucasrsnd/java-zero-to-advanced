package fundamentos;

import java.util.Scanner;

public class Exercicio1 {
	
	/* 1. Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = entrada.nextDouble();
		
		double farenheit = celsius * 1.8 + 32;
		
		System.out.print("O valor em Farenheit é: " + farenheit);
		
		entrada.close();
	}

}