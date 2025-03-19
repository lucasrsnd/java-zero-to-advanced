package controle;

public class DesafioIf {

	public static void main(String[] args) {

		// não usar ";" em estruturas de controle (tem uma exceção)
		// o desafio era reconhecer o que estava errado
		// e estava assim: "if(nota >= 9.0); {"

		double nota = 1.3;

		if (nota >= 9.0) {
			System.out.println("Quadro de Honra!");
			System.out.println("Você é fera!");
		}
	}
}
