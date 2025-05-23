package main.java.br.com.cod3r.cm.modelo;
import main.java.br.com.cod3r.cm.excecao.ExplosaoException;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private final int linha;
    private final int coluna;
    private boolean aberto = false;
    private boolean minado = false;
    private boolean marcado = false;
    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObservador> observadores = new ArrayList<>();

    public Campo(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
    }

    public boolean adicionarVizinho(Campo vizinho) {
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;


        int deltaLinha = Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna + deltaLinha;

        if(deltaGeral == 1 && !diagonal){
            vizinhos.add(vizinho);
            return true;
        } else if (deltaGeral == 2 && diagonal){
            vizinhos.add(vizinho);
            return true;
        } else{
            return false;
        }
    }

    public void alternarMarcacao() {
        if(!aberto) {
            marcado = !marcado;
            notificarObservadores(marcado ? CampoEvento.MARCAR : CampoEvento.DESMARCAR);
        }
    }

    public boolean abrir() {
        if(!aberto && !marcado) {
            aberto = true;

            if(minado) {
                notificarObservadores(CampoEvento.EXPLODIR);
                throw new ExplosaoException();
            }

            if(vizinhancaSegura()) {
                vizinhos.forEach(v -> v.abrir());
            }

            notificarObservadores(CampoEvento.ABRIR);
            return true;
        }
        return false;
    }

    public boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(v-> v.minado);
    }

    public void minar(){
        minado = true;
    }

    public boolean isMinado(){
        return minado;
    }


    public boolean isMarcado(){
        return marcado;
    }

    public boolean isAberto(){
        return aberto;
    }
    public boolean isFechado(){
        return !aberto;
    }

    void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    boolean objetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && marcado;
        return desvendado || protegido;
    }
    public long minasNaVizinhanca(){
        return vizinhos.stream().filter(v -> v.minado).count();
    }
    void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
    }
    public String toString(){
        if(marcado){
            return "x";
        } else if (aberto && minado){
            return  "*";
        } else if (aberto && minasNaVizinhanca() > 0){
            return Long.toString(minasNaVizinhanca());
        } else if (aberto){
            return " ";
        } else{
            return "?";
        }
    }

    public void registrarObservador(CampoObservador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(CampoEvento evento) {
        observadores.forEach(o -> o.eventoOcorreu(this, evento));
    }

    public void setAbertoForcado(boolean aberto) {
        this.aberto = aberto;
        notificarObservadores(CampoEvento.ABRIR);
    }

}
