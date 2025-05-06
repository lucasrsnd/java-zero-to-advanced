package generics;

public class Par<C, V> {
    private C chave;
    private V valor;

    public C getChave(){
        return chave;
    }
    public void setChave(){
        this.chave = chave;
    }
    public V getValor(){
        return valor;
    }
    public void setValor(V valor){
        this.valor = valor;
    }


}