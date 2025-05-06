package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main (String [] args){
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Bia");
        System.out.println("Usando o foreach...");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("Usando o iterator...");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //stream = sequencia de dados
        System.out.println("Usando Stream...");
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println); //laço interno!!!
    }
}