public class Produto {

    private int estoque;
    private double preco;
    private String item;


    public Produto(String item, double preco) {
        this.item = item;
        this.preco = preco;
        this.estoque = 0;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        if (estoque >= 0) {
            this.estoque = estoque;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println("Adicionado " + quantidade + " ao estoque.");
        }
    }


    public void exibirDetalhes() {
        System.out.println("Item: " + this.item);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("Preço: " + this.preco);
    }
}
