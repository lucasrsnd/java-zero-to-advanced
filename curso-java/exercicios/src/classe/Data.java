package classe;

// AS AULAS "THIS E THIS()", "VARIÁVEIS LOCAIS", "VALORES PADRÕES",
// FORAM REALIZADAS NESSE ARQUIVO

public class Data {

	int dia;
	int mes;
	int ano;
	
	// VALORES PADRÕES:
	// byte, short, int, long -> 0
	// float, double -> 0.0
	// boolean -> false
	// char -> '\u0000'
	// objetos -> null (não aponta para nenhum local de memória)
	
	Data () {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}
	
	Data (int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
