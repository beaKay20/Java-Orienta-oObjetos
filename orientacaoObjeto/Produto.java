package orientacaoObjeto;


public class Produto {
// Atributos
String nome;
double preco;
int quantidadeEmEstoque;

// Construtor
public Produto(String nome, double preco, int quantidadeEmEstoque) {
    this.nome = nome;
    this.preco = preco;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
}

public void realizarCompra(int quantidadeComprada) {
    if (quantidadeComprada > 0 && quantidadeComprada <= quantidadeEmEstoque) {
        quantidadeEmEstoque -= quantidadeComprada;
        System.out.println("Sua compra foi realizada com sucesso. Total gasto: R$ " + (quantidadeComprada * preco));
    } else {
        System.out.println("Quantidade inválida ou insuficiente em estoque.");
    }
}

public void exibirInformacoes() {
    System.out.println("Nome: " + nome);
    System.out.println("Preço: R$ " + preco);
    System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
}

public static void main(String[] args) {
    Produto produto1 = new Produto("Saia", 45.00, 50);
    produto1.exibirInformacoes();
    produto1.realizarCompra(10);
    produto1.exibirInformacoes();
}
}
