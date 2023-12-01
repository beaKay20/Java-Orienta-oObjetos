package orientacaoObjeto;

//import array
import java.util.ArrayList;

public class Empresa {
    String nome;
    String cnpj;
    ArrayList<TutoraIA> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }


    public void contratarFuncionario(TutoraIA funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário contratado: " + funcionario.getNome());
    }

    public void demitirFuncionario(TutoraIA funcionario) {
        if (funcionarios.contains(funcionario)) {
            funcionarios.remove(funcionario);
            System.out.println("Funcionário demitido: " + funcionario.getNome());
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
    public void exibirInformacoesFuncionarios() {
        System.out.println("Lista de funcionários da empresa " + nome + ":");
        for (TutoraIA funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo());
        }
    }

    public static void main(String[] args) {

        Empresa minhaEmpresa = new Empresa("Tutora.IA", "123456789");


        TutoraIA funcionario1 = new TutoraIA("Bea", "Desenvolvedora");
        TutoraIA funcionario2 = new TutoraIA("Davi", "Analista de Dados");

        minhaEmpresa.contratarFuncionario(funcionario1);
        minhaEmpresa.contratarFuncionario(funcionario2);

        minhaEmpresa.exibirInformacoesFuncionarios();


        minhaEmpresa.demitirFuncionario(funcionario1);

        minhaEmpresa.exibirInformacoesFuncionarios();
    }
}

class TutoraIA {

    String nome;
    String cargo;


    public TutoraIA(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }


    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}
