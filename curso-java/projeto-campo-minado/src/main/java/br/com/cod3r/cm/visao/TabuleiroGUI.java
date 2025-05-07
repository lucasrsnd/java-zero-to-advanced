package main.java.br.com.cod3r.cm.visao;

import main.java.br.com.cod3r.cm.modelo.Tabuleiro;
import main.java.br.com.cod3r.cm.modelo.ResultadoEvento;
import javax.swing.*;
import java.awt.*;
import java.util.function.BiConsumer;

public class TabuleiroGUI extends JPanel {
    public TabuleiroGUI(Tabuleiro tabuleiro) {
        setLayout(new GridLayout(
                tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.getCampos().forEach(c -> add(new CampoButton(c)));

        tabuleiro.registrarObservador((evento, resultado) -> {
            SwingUtilities.invokeLater(() -> {
                if(evento == ResultadoEvento.GANHOU) {
                    JOptionPane.showMessageDialog(this, "Parabéns! Você ganhou!", "Vitória",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Game Over! Você atingiu uma mina!", "Derrota",
                            JOptionPane.ERROR_MESSAGE);
                }
                tabuleiro.reiniciar();
            });
        });
    }
}