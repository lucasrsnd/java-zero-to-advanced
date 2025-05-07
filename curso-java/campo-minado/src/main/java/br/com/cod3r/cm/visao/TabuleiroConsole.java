package main.java.br.com.cod3r.cm.visao;

import main.java.br.com.cod3r.cm.excecao.ExplosaoException;
import main.java.br.com.cod3r.cm.excecao.SairException;
import main.java.br.com.cod3r.cm.modelo.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo() {
        try {
            boolean continuar = true;

            while (continuar) {
                cicloDoJogo();
                System.out.println("Outra partida? (S/n)");
                String resposta = entrada.nextLine();

                if ("n".equalsIgnoreCase(resposta)) {
                    continuar = false;
                } else {
                    tabuleiro.reiniciar();
                }
            }
        } catch (SairException e) {
            System.out.println("Jogo finalizado!");
        } finally {
            entrada.close();
        }
    }

    private void cicloDoJogo() {
        try {
            while (!tabuleiro.objetivoAlcancado()) {
                System.out.println(tabuleiro);

                String digitado = capturarValorDigitado("Digite (linha coluna) ou (linha,coluna): ");

                digitado = digitado.replace(",", " ");

                try {
                    Iterator<Integer> xy = Arrays.stream(digitado.split("\\s+"))
                            .map(e -> Integer.parseInt(e.trim())).iterator();

                    int linha = xy.next();
                    int coluna = xy.next();

                    digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

                    if ("1".equals(digitado)) {
                        tabuleiro.abrir(linha, coluna);
                    } else if ("2".equals(digitado)) {
                        tabuleiro.alternarMarcacao(linha, coluna);
                    }
                } catch (NumberFormatException | java.util.NoSuchElementException e) {
                    System.out.println("Formato inválido! Use 'linha coluna' ou 'linha,coluna'");
                }
            }

            System.out.println(tabuleiro);
            System.out.println("Parabéns! Você venceu!");
        } catch (ExplosaoException e) {
            System.out.println(tabuleiro);
            System.out.println("Game Over! Você atingiu uma mina!");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = entrada.nextLine();

        if ("sair".equalsIgnoreCase(digitado)) {
            throw new SairException();
        }

        return digitado;
    }
}