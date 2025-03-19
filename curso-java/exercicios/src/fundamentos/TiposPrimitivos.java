package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informações do funcionário
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//tipo caractere
		char status = 'A'; //ativo
		
		
		//calcular dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//calcular número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//calcular pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario); //salario do funcionario
		System.out.println("Férias? " + estaDeFerias); //se está de férias
		System.out.println("Status: " + status); //status do funcionário
		
	}
}
