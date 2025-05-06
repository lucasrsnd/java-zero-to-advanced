package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Amanda", 7.8);
        Aluno a2 = new Aluno("Bia", 9);
        Aluno a3 = new Aluno("Daniel", 6.5);
        Aluno a4 = new Aluno("Tiago", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> saudacaoAprovado =
                a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!\n";

        System.out.println("Versão normal");
        alunos.stream()
                .filter(a -> a.nota >= 7)
                .map(a -> "Parabens " + a.nome + "! Você foi aprovado(a)!\n")
                .forEach(System.out::print);
        System.out.println("");
        System.out.println("Versão com predicate");
        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::print);
    }
}