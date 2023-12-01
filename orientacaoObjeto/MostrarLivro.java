package orientacaoObjeto;

public class MostrarLivro {
    public static void main(String[] args) {
        System.out.println("Crie uma classe chamada 'Livro' com atributos como título, autor e número de páginas. Adicione métodos para exibir informações sobre o livro. ");


        Livro livro01 = new Livro();
        System.out.println("O titulo do livro é: "+livro01.titulo);
        System.out.println("A autora do livro é: "+livro01.autor);
        System.out.println("e o livro contém o total de: "+livro01.numeroDePaginas+ " páginas.");
    }
}