package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//isso vai dar verdadeiro
		System.out.println("2" == "2");
		
		//isso vai dar falso
		String s1 = new String("2");
		System.out.println("2" == s1);
		
		//isso vai dar verdadeiro
		System.out.println("2".equals(s1)); //equals serve para comparar
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();
		
		System.out.println("2" == s2.trim()); //o trim tira os espaços em branco
		System.out.println("2".equals(s2.trim())); //esse é o correto
		
		entrada.close();
	}
}
