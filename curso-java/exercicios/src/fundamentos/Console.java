package fundamentos;

import java.util.Scanner; //import para o scanner

public class Console {
public static void main(String[] args) {
	
	//mesma linha
	System.out.print("Bom");
	System.out.print(" dia!\n");
	
	//quebra de linha
	System.out.println("Bom");
	System.out.print("dia!");
	
	//formatado
	System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
	System.out.printf("Salário: %.1f\n", 1234.5678);
	System.out.printf("Nome: %s\n", "João");
	
	//utilização do scanner (nextline é para string, nextint é para inteiro, e tem vários outros next´s)
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite o seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.print("Digite o seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.print("Digite a sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.printf("%s %s tem %d anos.\n", nome, sobrenome, idade);
	
	//fechar scanner
	entrada.close();
	
}
}
