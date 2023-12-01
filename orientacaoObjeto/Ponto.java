package orientacaoObjeto;

public class Ponto {
    // Atributos
    private double x;
    private double y;

    // Construtor
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos para definir os valores de x e y
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Métodos para obter os valores de x e y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método para exibir os valores de x e y
    public void exibirCoordenadas() {
        System.out.println("Coordenadas: (" + x + ", " + y + ")");
    }

    // Exemplo de uso da classe
    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada 'Ponto' com atributos 'x' e 'y' (coordenadas) e métodos para definir e exibir esses valores. ");
        // Criando um objeto Ponto
        Ponto ponto1 = new Ponto(3.0, 4.0);

        // Exibindo as coordenadas iniciais
        System.out.println("Coordenadas iniciais: ");
        ponto1.exibirCoordenadas();

        // Modificando as coordenadas
        ponto1.setX(5.0);
        ponto1.setY(7.0);

        // Exibindo as coordenadas após a modificação
        System.out.println("Coordenadas após modificação:");
        ponto1.exibirCoordenadas();
    }

}
