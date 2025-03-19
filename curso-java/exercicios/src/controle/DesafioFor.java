package controle;

public class DesafioFor {

	//o desafio é fazer o código abaixo, só que sem usar valores numéricos
	
	public static void main(String[] args) {
		
		/*String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}*/
		
		//nova versão:
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
