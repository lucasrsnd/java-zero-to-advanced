package controle;

import java.util.Scanner;

public class DesafioWhile {

	/*
	 * quero calcular a média das notas dos alunos de uma turma, o usuário digita
	 * uma nota válida de 0 a 10, você armazena essa nota em uma variável chamada
	 * total, e sempre que o usuário digitar uma nota válida você soma. Para o
	 * usuário sair, basta digitar -1. Se digitar uma nota inválida, peça para
	 * digitar uma nota válida.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.print("Informe a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if(nota != -1){
				System.out.println("Informe uma nota válida: ");
			}
		}

		// calcular média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);

		entrada.close();
	}
}
