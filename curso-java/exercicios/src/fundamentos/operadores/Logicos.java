package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		// TESTES
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);

		// OPERADORES BINÁRIOS
		// AND
		System.out.println("\nTabela verdade E");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);

		// OR
		System.out.println("\nTabela verdade OU");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		// XOR
		System.out.println("\nTabela verdade OU EXCLUSIVO");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		// OPERADOR UNÁRIO
		// NOT
		System.out.println("\nTabela verdade NEGAÇÃO");
		System.out.println(!true);
		System.out.println(!false);
	}
}
