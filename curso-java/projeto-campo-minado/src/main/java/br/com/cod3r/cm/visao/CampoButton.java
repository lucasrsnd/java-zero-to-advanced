package main.java.br.com.cod3r.cm.visao;

import main.java.br.com.cod3r.cm.excecao.ExplosaoException;
import main.java.br.com.cod3r.cm.modelo.Campo;
import main.java.br.com.cod3r.cm.modelo.CampoEvento;
import main.java.br.com.cod3r.cm.modelo.CampoObservador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CampoButton extends JButton implements CampoObservador, MouseListener {
    private final Color BG_PADRAO = new Color(184, 184, 184);
    private final Color BG_MARCADO = new Color(8, 179, 247);
    private final Color BG_EXPLOSAO = new Color(189, 66, 68);
    private final Color TEXTO_VERDE = new Color(0, 100, 0);
    private Campo campo;

    public CampoButton(Campo campo) {
        this.campo = campo;
        setBackground(BG_PADRAO);
        setBorder(BorderFactory.createBevelBorder(0));
        addMouseListener(this);
        campo.registrarObservador(this);
    }

    @Override
    public void eventoOcorreu(Campo campo, CampoEvento evento) {
        switch(evento) {
            case ABRIR: aplicarEstiloAbrir(); break;
            case MARCAR: aplicarEstiloMarcar(); break;
            case EXPLODIR: aplicarEstiloExplodir(); break;
            default: aplicarEstiloPadrao();
        }
    }

    private void aplicarEstiloPadrao() {
        setBackground(BG_PADRAO);
        setText("");
        setBorder(BorderFactory.createBevelBorder(0));
    }

    private void aplicarEstiloMarcar() {
        setBackground(BG_MARCADO);
        setForeground(Color.BLACK);
        setText("M");
    }

    private void aplicarEstiloAbrir() {
        setBorder(BorderFactory.createLineBorder(Color.GRAY));

        if(campo.isMinado()) {
            setBackground(BG_EXPLOSAO);
            return;
        }

        setBackground(BG_PADRAO);

        long minasVizinhas = campo.minasNaVizinhanca();

        switch ((int) minasVizinhas) {
            case 1:
                setForeground(TEXTO_VERDE);
                break;
            case 2:
                setForeground(Color.BLUE);
                break;
            case 3:
                setForeground(Color.YELLOW);
                break;
            case 4:
            case 5:
            case 6:
                setForeground(Color.RED);
                break;
            default:
                setForeground(Color.PINK);
        }

        String valor = !campo.vizinhancaSegura() ?
                minasVizinhas + "" : "";
        setText(valor);
    }

    private void aplicarEstiloExplodir() {
        setBackground(BG_EXPLOSAO);
        setForeground(Color.WHITE);
        setText("X");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        try {
            if(e.getButton() == 1) { // Botão esquerdo
                campo.abrir();
            } else { // Botão direito
                campo.alternarMarcacao();
            }
        } catch (ExplosaoException ex) {
            // A exceção será tratada pelo observador do tabuleiro
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}