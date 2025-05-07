package main.java.br.com.cod3r.cm;

import main.java.br.com.cod3r.cm.modelo.Tabuleiro;
import main.java.br.com.cod3r.cm.visao.TabuleiroGUI;

import javax.swing.*;

public class Aplicacao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
            JFrame frame = new JFrame("Campo Minado");
            frame.add(new TabuleiroGUI(tabuleiro));
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}