public class ControleOO_Main {
    public static void main(String[] args) {
        Student[] alunos = {
            new Student(1, "Kauã", 20, 1.87),
            new Student(2, "Héric", 20, 1.90),
            new Student(3, "Rafaela", 19, 1.58),
            new Student(4, "Pedro", 25, 1.60),
            new Student(5, "João", 15, 1.78),
            new Student(6, "Ana", 15, 1.69),
            new Student(7, "Maria", 21, 1.75),
            new Student(8, "Lucas", 22, 1.80),
            new Student(9, "Isaac", 24, 1.88),
            new Student(10, "Juliana", 14, 1.77)
        };
        ControleOO controle = new ControleOO(alunos);
        controle.media_idades();
        controle.mais_jovens();
        controle.percentual_idades();
        controle.altura_superior();
    }
}
