import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private String nome;
    private List<Professor> professores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Universidade(String nome){
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionar_professor(Professor professor){
        System.out.println("Professor adicionado!");
        professores.add(professor);
    }
    public void listarProfessores() {
        System.out.println("Professores da Universidade:");
        for (Professor professor : professores) {
            professor.exibirInfoProfessor();
        }
    }
}


//Em seguida, crie uma classe Universidade que agregue uma lista de professores. 
//A classe Universidade deve ter métodos para adicionar e listar os professores. 
//A existência de um professor deve ser independente da universidade.
