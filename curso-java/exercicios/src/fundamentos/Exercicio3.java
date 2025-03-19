package fundamentos;

import java.util.Scanner;

public class Exercicio3 {
	/* 3. Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a altura: ");
		double altura = entrada.nextDouble();
		
		double IMC = peso / (altura * altura);
		System.out.println("O IMC é: " + IMC);
		
		entrada.close();
		
	}

}