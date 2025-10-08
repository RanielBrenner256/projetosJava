import java.text.NumberFormat;
import java.util.Locale;
import java.util.List;

public class SistemaPedidos {
    public static void main(String[] args) {
        NumberFormat brl = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        Produto teclado   = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 79.10);
        Produto mousePad  = new Produto("Mouse Pad Preto", 8.90);
        Produto mouseDell = new Produto("Mouse Dell sem fio - WM118", 69.00);

        ClientePF clientePF = new ClientePF("Ana Silva", "ana.silva@gmail.com", "111.222.333-44");
        ClientePJ clientePJ = new ClientePJ("Tech Ltda.", "contato@techltda.com.br", "12.345.678/0001-90");

        Pedido pedidoPF = new Pedido(1, "Não finalizado", "28/08/2025", clientePF);
        pedidoPF.adicionarItem(teclado, 1);
        pedidoPF.adicionarItem(mousePad, 2);
        pedidoPF.calcularTotal();

        Pedido pedidoPJ = new Pedido(2, "Em processamento", "28/08/2025", clientePJ);
        pedidoPJ.adicionarItem(mouseDell, 2);
        pedidoPJ.adicionarItem(mousePad, 5);
        pedidoPJ.calcularTotal();

        imprimirPedido(pedidoPF, brl);
        System.out.println();
        imprimirPedido(pedidoPJ, brl);
    }

    private static void imprimirPedido(Pedido pedido, NumberFormat brl) {
        Cliente c = pedido.getCliente();

        System.out.println("Pedido " + pedido.getNumero() + " (" + pedido.getStatus() + ", " + pedido.getData() + ")");
        System.out.println("Cliente: " + c.getNome()  + c.getEmail() );
        System.out.println("Itens:");

        List<ItemPedido> lista = pedido.getItens();
        for (int i = 0; i < lista.size(); i++) {
            ItemPedido it = lista.get(i);
            System.out.println("- " + it.getProduto().getItem() + " (" + it.getQuantidade() + " un) — " + brl.format(it.getSubtotal()));
        }

        System.out.println("Total: " + brl.format(pedido.getPrecoTotal()));
    }
}

