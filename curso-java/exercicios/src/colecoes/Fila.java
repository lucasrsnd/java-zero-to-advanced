package colecoes;

import java.util.Queue;
import java.util.LinkedList;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// add e offer -> adicionam elementos na fila
		fila.add("Ana"); // .add lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); // .offer retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o próximo elemento da fila sem remover
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança uma exceção
		
		// poll e remove -> obter o próximo elemento da fila e remove
		System.out.println(fila.poll()); // poll retorna null
		System.out.println(fila.remove()); // lança uma exceção
		
		//fila.isEmpty(); saber se a fila está vazia
		//fila.clear(); limpar elemento da fila
		//fila.size(); saber o tamanho da fila
		//fila.contains(...); verificar se contém algum elemento específico
	}
}
