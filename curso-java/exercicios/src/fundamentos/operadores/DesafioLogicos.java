package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		// Ficar alterandno entre true e false para ver o resultado
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		// Operador binário
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTv50);
		System.out.println("Comprou Tv 32\"? " + comprouTv32);
		System.out.println("Comprou Sorvete\"? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}
}
