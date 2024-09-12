public class MAIN_Lista3_EX5 {
    public static void main(String[] args) {
        Biblioteca_Lista3 biblioteca = new Biblioteca_Lista3();

        Livro_Lista3 l1 = new Livro_Lista3("Harry Potter", "Kauã Fardin");
        Livro_Lista3 l2 = new Livro_Lista3("Harry Potter e as Relíquias da Morte", "Kauã Fardin");
        Livro_Lista3 l3 = new Livro_Lista3("Harry Potter e o Cálice de Fogo", "Kauã Fardin");

        biblioteca.adicionar(l1);
        biblioteca.adicionar(l2);
        biblioteca.adicionar(l3);

        biblioteca.retirar(l1);

        biblioteca.listarLivros();
    }
}
