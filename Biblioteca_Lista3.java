import java.util.ArrayList;
import java.util.List;

public class Biblioteca_Lista3 {
    private List<Livro_Lista3> livros;

    public Biblioteca_Lista3(){
        this.livros = new ArrayList<>();
    }

    public void adicionar(Livro_Lista3 livro){
        if (livro != null) {
            livros.add(livro);
            System.out.println("Livro adicionado: " + livro.getTitulo());
        } else {
            System.out.println("O livro é nulo e não pode ser adicionado.");
        }
    }

    public void retirar(Livro_Lista3 livro) {
        if (livro != null){
            livros.remove(livro);
            System.out.println("Livro " + livro.getTitulo() + " retirado!");
        } else {
            System.out.println("Livro não encontrado!");
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro_Lista3 livro : livros) {
                livro.exibir();
            }
        }
    }
}


