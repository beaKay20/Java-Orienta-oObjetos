package orientacaoObjeto;

public class ContaBancaria {
    // Atributos
    double saldo;
    String numeroDaConta;


    public ContaBancaria(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        System.out.println("Crie uma classe 'ContaBancaria' com atributos como saldo e número da conta. Adicione métodos para depositar, sacar e exibir o saldo. ");
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    // Método para sacar dinheiro da conta
    public void saque(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo da conta " + numeroDaConta + ": R$ " + saldo);
    }

    public static void main(String[] args) {
        // Criando uma conta bancária com o número da conta
        ContaBancaria conta1 = new ContaBancaria("123456");

        // Exibindo o saldo inicial
        conta1.exibirSaldo();

        // Realizando um depósito
        conta1.depositar(1000.0);

        // Exibindo o saldo após o depósito
        conta1.exibirSaldo();

        // Realizando um saque
        conta1.saque(500.0);

        // Exibindo o saldo após o saque
        conta1.exibirSaldo();
    }
}
