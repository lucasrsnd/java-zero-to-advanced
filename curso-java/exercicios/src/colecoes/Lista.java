package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		// criei uma variável e depois adicionei na lista
		Usuario u1 = new Usuario ("Ana");
		lista.add(u1);
		
		// coloquei o objeto diretamente na lista
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		
		lista.remove(1); // remover pelo índice
		lista.remove(new Usuario("Manu")); // remover pelo objeto
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // verifica se está na lista
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
