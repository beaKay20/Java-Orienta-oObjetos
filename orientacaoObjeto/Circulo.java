package orientacaoObjeto;

public class Circulo {
    private Ponto centro;
    private double raio;


    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    // Método para obter o raio do círculo
    public double getRaio() {
        return raio;
    }

    // Método para calcular a área do círculo (π * raio^2)
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    // Método para calcular o perímetro do círculo (2 * π * raio)
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    // Método para exibir informações sobre o círculo, incluindo o ponto central e o raio
    public void exibirInformacoes() {
        System.out.println("Círculo com centro em:");
        centro.exibirCoordenadas();
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    // Exemplo de uso da classe Circulo
    public static void main(String[] args) {
        // Criando um ponto que representa o centro do círculo
        Ponto centroDoCirculo = new Ponto(2.0, 3.0);

        // Criando um círculo com o ponto central e um raio
        Circulo circulo1 = new Circulo(centroDoCirculo, 5.0);

        // Exibindo informações sobre o círculo
        circulo1.exibirInformacoes();
    }
}
