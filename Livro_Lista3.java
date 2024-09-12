public class Livro_Lista3 {
    private String titulo;
    private String autor;

    public Livro_Lista3(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibir(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

}


//Crie uma classe Livro com atributos como título e autor. 
//Em seguida, crie uma classe Biblioteca que compõe vários livros. 
//Cada livro deve ser parte integrante da biblioteca. Se a biblioteca for destruída, os livros também devem ser.
