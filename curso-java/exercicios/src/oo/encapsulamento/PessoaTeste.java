package oo.encapsulamento;

public class PessoaTeste {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Pedro", "Lourenço", -45);
        p1.setIdade(230); // alterar valor da variável

        System.out.println(p1.getIdade()); // ler variável
        System.out.println(p1); // toString
        System.out.println(p1.getNomeCompleto()); // nome completo
    }
}
