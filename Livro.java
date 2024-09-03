public class Livro {
    String titulo;
    String autor;
    String ano_publicacao;

    public Livro(String titulo, String autor, String ano_publicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
    }
    public void exibir_detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}


//A classe `Livro` deve ter atributos como `titulo`, `autor` e `anoPublicacao`.