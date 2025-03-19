package fundamentos;

import java.util.Scanner;

public class Exercicio5 {
	/*5. Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A área do triângulo é: " + area);
		
		entrada.close();
	}

}