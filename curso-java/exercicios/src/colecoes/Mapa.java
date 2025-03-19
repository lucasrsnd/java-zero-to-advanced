package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		 
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); // put adiciona se não existir, e substitui caso já exista
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		// bom ir testando cada um, só remover o comentário
//		System.out.println(usuarios.size());
//		System.out.println(usuarios.isEmpty());
//		System.out.println(usuarios.keySet());
//		System.out.println(usuarios.values());
//		System.out.println(usuarios.entrySet());
//		System.out.println(usuarios.containsKey(20));
//		System.out.println(usuarios.containsValue("Rebeca"));
//		System.out.println(usuarios.get(4));
//      System.out.println(usuarios.remove(1));
		
		//para percorrer usando foreach:
		
		// para chave
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// para valor
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		// para chave e valor ao mesmo tempo em um só foreach
		for (Entry <Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}
}
