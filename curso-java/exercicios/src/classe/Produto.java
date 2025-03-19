package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	//criar um produto sem passar nenhum parâmentro
	Produto() {

	}

	//criar um produto passando por nome, preço e desconto
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}

}
