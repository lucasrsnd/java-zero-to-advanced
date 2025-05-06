package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {
        Caixa<Integer> caixaA = new CaixaInt();
        caixaA.aguardar(123);

        int coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}