package main.java.br.com.cod3r.cm;

import main.java.br.com.cod3r.cm.modelo.Tabuleiro;
import main.java.br.com.cod3r.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);  // Removidas as chamadas prévias
    }
}