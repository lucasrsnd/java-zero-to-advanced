package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();

        Pedido pedido = new Pedido();
        Produto produto = new Produto("Geladeira", 2765.70);
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirTransacao()
            .incluir(produto)
            .incluir(pedido)
            .incluir(item)
            .fecharTransacao()
            .fecharEM();
    }
}
