package main.java.br.com.cod3r.cm.modelo;

import main.java.br.com.cod3r.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class Tabuleiro {
    private int linhas;
    private int colunas;
    private int minas;
    private final List<Campo> campos = new ArrayList<>();
    private List<BiConsumer<ResultadoEvento, Boolean>> observadores = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;

        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void abrir(int linha, int coluna) {
        try {
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(c -> c.abrir());

            if(objetivoAlcancado()) {
                notificarObservadores(true);
            }
        } catch(ExplosaoException e) {
            // Abre todos os campos para mostrar onde estavam as minas
            campos.forEach(c -> c.setAbertoForcado(true));
            notificarObservadores(false);
        }
    }

    public void alternarMarcacao(int linha, int coluna) {
        campos.parallelStream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst()
                .ifPresent(c -> c.alternarMarcacao());
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linha, coluna));
            }
        }
    }

    private void associarVizinhos() {
        for (Campo c1 : campos) {
            for (Campo c2 : campos) {
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = Campo::isMinado;

        do {
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
            minasArmadas = campos.stream().filter(minado).count();
        } while (minasArmadas < minas);
    }

    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar() {
        campos.forEach(Campo::reiniciar);
        sortearMinas();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("   ");
        for (int c = 0; c < colunas; c++) {
            sb.append(" ").append(c).append(" ");
        }
        sb.append("\n");

        int i = 0;
        for (int l = 0; l < linhas; l++) {
            sb.append(" ").append(l).append(" ");
            for (int c = 0; c < colunas; c++) {
                sb.append(" ").append(campos.get(i)).append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void registrarObservador(BiConsumer<ResultadoEvento, Boolean> observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(boolean resultado) {
        observadores.forEach(o -> o.accept(
                resultado ? ResultadoEvento.GANHOU : ResultadoEvento.PERDEU,
                resultado
        ));
    }


}