package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked"}) // estratégia para esconder as advertências
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		// o tamanho não vai mudar porque é o mesmo
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); // false porque não existe "teste"
		System.out.println(conjunto.remove("Teste")); // true
		System.out.println(conjunto.remove('x')); // true
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); // falso porque já removi a letra x
		System.out.println(conjunto.contains(1)); // true
		System.out.println(conjunto.contains(true)); // true
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // união entre dois conjuntos
		conjunto.retainAll(nums); // valor em comum entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.clear(); // limpa o conjunto
		System.out.println(conjunto);
		
	}
}
