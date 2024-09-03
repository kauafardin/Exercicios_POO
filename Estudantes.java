import java.util.List;
import java.util.ArrayList;
public class Estudantes {
    String nome = "";
    String matricula = "";
    List<Disciplina> disciplinas = new ArrayList<>();

    public void matricular_aluno(Disciplina disciplina){
        disciplinas.add(disciplina);
        System.out.println("Aluno: " + nome + " matriculado com sucesso!");
        
    }
    public double calcular_media() {
        double soma = 0;
        for (Disciplina disciplina : disciplinas) {
            soma += disciplina.nota;
        }
        return soma / disciplinas.size();
    }
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas:");
        for (Disciplina disciplina : disciplinas) {
            disciplina.exibir();
            System.out.println();
        }
        System.out.println("Média das notas: " + calcular_media());
    }
}
 
//Crie uma classe `Aluno` com atributos `nome`, `matricula`, e uma lista de objetos da classe `Disciplina`.
 //Adicione métodos na classe `Aluno` para matricular-se em uma disciplina e calcular a média das notas das disciplinas matriculadas.