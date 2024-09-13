import java.util.ArrayList;
import java.util.List;

public class Escola_Lista3 {
    private List<Estudante_Lista3> estudantes;

    public Escola_Lista3(){
        this.estudantes = new ArrayList<>();
    }

    public void matricular(Estudante_Lista3 estudante){
        if (estudante != null){
            estudantes.add(estudante);
            System.out.println("Estudante " + estudante.getNome() + " matriculado!");
        } else{
            System.out.println("Estudante inválido");
        }
    }

    public void listar(){
        if (estudantes.isEmpty()){
            System.out.println("A escola não possui estudantes!");
        }else {
            System.out.println("Estudantes: ");
            for (Estudante_Lista3 estudante : estudantes){
                estudante.exibir();
            }
        }
    }
}
