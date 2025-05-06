package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        geraErro1();

        try {
            geraErro2();
        } catch (Throwable e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    // EXCEÇÃO NÃO CHECADA OU NAO VERIFICADA (CONSIDERADA MELHOR)
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    // EXCEÇÃO CHECADA OU VERIFICADA
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}