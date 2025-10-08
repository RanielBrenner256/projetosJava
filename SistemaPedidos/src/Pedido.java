import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numero;
    private String status;
    private String data;
    private double precoTotal;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido(int numero, String status, String data, Cliente cliente) {
        this.numero = numero;
        this.status = status;
        this.data = data;
        this.cliente = cliente;
        this.precoTotal = 0.0;
        this.itens = new ArrayList<>();
    }


    public void adicionarItem(Produto produto, int quantidade) {

        ItemPedido item = new ItemPedido(produto, quantidade);
        this.itens.add(item);
        this.precoTotal += item.getSubtotal();
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0, n = itens.size(); i < n; i++) {
            ItemPedido it = itens.get(i);
            if (it != null) {
                total += it.getSubtotal();
            }
        }

        this.precoTotal = total;
        return total;
    }


    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public double getPrecoTotal() {
        return
                precoTotal;
    }

    public Cliente getCliente() {

        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return new ArrayList<>(itens);
    }
}