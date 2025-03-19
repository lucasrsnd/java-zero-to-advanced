package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		//primeira parte da operação de cima
		double numerador1 = 6 * (3 + 2);
		double exponencial1 = Math.pow(numerador1, 2);
		double resultado1 = exponencial1 / (3*2);
		
		//segunda parte da operação de cima
		double numerador2 = (1-5) * (2-7);
		double resultado2 = numerador2 / 2;
		double exponencial2 = Math.pow(resultado2, 2);
		
		//resultado numerador
		double resultadoTotalNumerador = resultado1 - exponencial2;
		double exponencialTotal = Math.pow(resultadoTotalNumerador, 3);

		//conversão 10^3
		double denominador = 10;
		double exponencial3 = Math.pow(denominador, 3);
		
		//resultado da operação
		double resultadoOperacao = (exponencialTotal / exponencial3);
		System.out.println(resultadoOperacao);
		
	}
}