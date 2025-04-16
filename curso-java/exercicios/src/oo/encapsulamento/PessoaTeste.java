package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.idade = -30; // alterar valor da variável

        System.out.println(p1.idade); // ler variável
    }
}
