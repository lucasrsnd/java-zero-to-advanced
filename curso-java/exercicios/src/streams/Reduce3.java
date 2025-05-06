package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Amanda", 7.8);
        Aluno a2 = new Aluno("Bia", 9);
        Aluno a3 = new Aluno("Daniel", 6.5);
        Aluno a4 = new Aluno("Tiago", 7);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;

        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);


        BinaryOperator<Media> combiner =
                (m1,m2) -> Media.combinar(m1,m2);

        Media media = (Media) alunos.parallelStream();

        alunos.stream()
                //.filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combiner);

        System.out.println("A media do aluno é " + media.getValor());
    }
}