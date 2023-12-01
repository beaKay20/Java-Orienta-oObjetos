package orientacaoObjeto;

public class Carro {
    String modelo;
    int ano;
    String cor;
    boolean ligado;

    // Construtor
    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.ligado = false; // O carro é inicializado desligado
    }


    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método para exibir informações sobre o carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Tesla", 2022, "Azul");

        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.exibirInformacoes();
        meuCarro.desligar();
        meuCarro.exibirInformacoes();
    }
}
