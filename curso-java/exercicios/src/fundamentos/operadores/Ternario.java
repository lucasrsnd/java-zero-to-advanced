package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 8.6; //mude os valores para testar
		String resultadoFinal = media >= 7.0 ? "aprovado." : "em recuperação.";
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.9; // altere a nota para ver o resultado
		boolean bomComportamento = false; // altere para ver o resultado
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "Não.";
		System.out.println("Tem desconto? " + resultado);
	}
}
