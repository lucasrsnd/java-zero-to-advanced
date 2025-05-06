package streams;

import java.util.List;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        int total = nums.stream().reduce(soma).get();
        System.out.println(total);

        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total);

        Integer total2 = nums.parallelStream().reduce(100, soma);

        //o resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 180)
                .reduce(soma)
                .ifPresent(System.out::println);

        Integer a = null;
        //int b =a; NullPointerException (nao pode atribuir null a um tipo primitivo, so a objetos)
    }
}