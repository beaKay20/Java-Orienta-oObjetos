package orientacaoObjeto;
import java.util.ArrayList;

public class Agenda {

         ArrayList<String> contatos;


        public Agenda() {
            this.contatos = new ArrayList<>();
        }

        // Método que vai adicionar um contato
        public void adicionarContato(String contato) {
            System.out.print("Crie uma classe 'Agenda' para armazenar contatos. Adicione métodos para adicionar, remover e exibir contatos. ");
            contatos.add(contato);
            System.out.println("Contato adicionado: " + contato);
        }

        // remover  contato
        public void removerContato(String contato) {
            if (contatos.contains(contato)) {
                contatos.remove(contato);
                System.out.println("Contato removido: " + contato);
            } else {
                System.out.println("Contato não encontrado.");
            }
        }

        // Todos contatos
        public void exibirContatos() {
            if (contatos.isEmpty()) {
                System.out.println("Agenda vazia. Nenhum contato para exibir.");
            } else {
                System.out.println("Lista de contatos:");
                for (String contato : contatos) {
                    System.out.println(contato);
                }
            }
        }

        // Exemplo de uso da classe Agenda
        public static void main(String[] args) {
            Agenda minhaAgenda = new Agenda();

            minhaAgenda.adicionarContato("Beatriz");
            minhaAgenda.adicionarContato("Yago");
            minhaAgenda.adicionarContato("Carlos");

            minhaAgenda.exibirContatos();

            minhaAgenda.removerContato("Yago");


            minhaAgenda.exibirContatos();
        }


}
