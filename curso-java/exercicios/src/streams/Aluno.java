package streams;

public class Aluno {

    final public String nome;
    final public double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }
    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }

    public String toString(){
        return nome + " tem nota " + nota;
    }

}