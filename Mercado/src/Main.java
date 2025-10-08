//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produtos p1 = new Produtos();
        p1.setNome("Sabão em pó");
        p1.setPreco(16.00);
        p1.setEstoque(15);

        System.out.println("============Higiene============");



        System.out.println("Nome : "+p1.getNome());
        System.out.println("Preço : R$ "+p1.getPreco());
        System.out.println("Estoque : "+p1.getEstoque()+" uni");

        Acougue a1= new Acougue("Picanha", 32);
        System.out.println("============Açougue============");
        System.out.println("Nome : "+a1.getNome());
        System.out.println("Preço : R$ "+a1.getPreco());
        }
    }
