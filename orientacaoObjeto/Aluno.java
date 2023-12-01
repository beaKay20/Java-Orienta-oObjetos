package orientacaoObjeto;

import java.util.Scanner;

public class Aluno {
    String nome;
    int matricula;
    float notas;

    public float calcularMedia(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();


        aluno1.nome = "Bea";
        aluno1.matricula = 20;
        System.out.println("Crie uma classe 'Aluno' com atributos como nome, matrícula e notas. Adicione métodos para calcular a média das notas. ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe sua Nota 1:");
        float nota1 = scanner.nextFloat();

        System.out.println("Informe sua Nota 2:");
        float nota2 = scanner.nextFloat();

        System.out.println("Informe sua Nota 3:");
        float nota3 = scanner.nextFloat();

        float media = aluno1.calcularMedia(nota1, nota2, nota3);
        System.out.println("A média das notas é: " + media);
        scanner.close();
    }
}
