package fundamentos;

import java.util.Scanner;

public class Exercicio2 {
	/*2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double farenheit = entrada.nextDouble();
		
		double celsius = (farenheit - 32) / 1.8;
		
		System.out.println("A temperatura em Celsius é: " + celsius);
		
		entrada.close();
	}

}