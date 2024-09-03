import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    List<Livro> livros = new ArrayList<>();

    public void adicionar_livros(Livro livro){
        System.out.println("Adicionando Livros!");
        livros.add(livro);
        System.out.println("Livro: " + livro.titulo + " adicionado com sucesso!");
    }
    public void retirar_livros(Livro livro){
        System.out.println("\nRetirando livros!");
        if (livros.remove(livro)){
            System.out.println("Livro: " + livro.titulo + " retirado com sucesso!");
        }else{
            System.out.println("Livro: " + livro.titulo + " não encontrado!");
        }
    }
    public void buscar_livro_autor(String autor) {
        System.out.println("\nBuscando livro por autor!");
        boolean encontrou = false;
        for (Livro livro : livros) {
            if (autor.equals(livro.autor)) {
                livro.exibir_detalhes();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro encontrado");
        }
    }
    
    public void buscar_livro_titulo(String titulo) {
        System.out.println("\nBuscando livro por título!");
        boolean encontrou = false;
        for (Livro livro : livros) {
            if (titulo.equals(livro.titulo)) {
                livro.exibir_detalhes();
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro encontrado");
        }
    }
    public void exibir(){
        System.out.println("\nExibindo detalhes!");
        for (Livro livro : livros){
            System.out.println("Título: " + livro.titulo);
            System.out.println("Autor: " + livro.autor);
            System.out.println("Ano Publicação: " + livro.ano_publicacao);
        }
    }
}

//Crie uma classe `Biblioteca` que tenha uma lista de objetos `Livro`.
 
//Implemente métodos na classe `Biblioteca` para adicionar e remover livros, além de um método para buscar livros por autor ou título.