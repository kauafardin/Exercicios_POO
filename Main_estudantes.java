public class Main_estudantes {
    public static void main(String[] args) {
        Disciplina matematica = new Disciplina();
        Disciplina portugues = new Disciplina();

        matematica.nome = "Matemática";
        matematica.nota = 10;
        portugues.nome = "Português";
        portugues.nota = 7;

        matematica.exibir();
        portugues.exibir();

        Estudantes aluno1 = new Estudantes();
        Estudantes aluno2 = new Estudantes();

        aluno1.nome = "Kauã Fardin";
        aluno1.matricula = "001";
        aluno2.nome = "João Pedro";
        aluno2.matricula = "002";

        aluno1.matricular_aluno(portugues);
        aluno1.matricular_aluno(matematica);
        aluno2.matricular_aluno(matematica);

        aluno1.exibir();
        aluno2.exibir();


    }
}
