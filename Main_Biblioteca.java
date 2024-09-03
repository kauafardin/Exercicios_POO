public class Main_Biblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", "1997");
        Livro livro2 = new Livro("Harry Potter e a Camera Secreta", "J. K. Rowling", "1998");
        Livro livro3 = new Livro("Harry Potter e o Prisioneiro de Askaban", "J. K. Rowling", "1999");

        biblioteca.adicionar_livros(livro1);
        biblioteca.adicionar_livros(livro2);
        biblioteca.adicionar_livros(livro3);

        biblioteca.buscar_livro_autor("J. K. Rowling");
        biblioteca.buscar_livro_titulo("Harry Potter e o Prisioneiro de Askaban");

        biblioteca.retirar_livros(livro2);

        biblioteca.exibir();
    }
}
