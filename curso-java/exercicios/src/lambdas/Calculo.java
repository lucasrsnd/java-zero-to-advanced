package lambdas;

@FunctionalInterface // UMA INTERFACE FUNCIONAL PODE CRIAR APENAS UM MÉTODO
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String muitoLegal() {
        return "muito legal";
    }
}
