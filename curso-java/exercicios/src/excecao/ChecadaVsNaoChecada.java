package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        geraErro1();

        try {
            geraErro2();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fim");
    }

    static void geraErro1(){
        new RuntimeException("Ocorreu um erro mto bão, #01!");
    }

    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro mto bão, #02!");
    }


}