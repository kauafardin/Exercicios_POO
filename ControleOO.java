public class ControleOO {
    Student[] alunos;

    public ControleOO(Student[] alunos){
        this.alunos = alunos;
    }
    public double media_idades(){
        double soma = 0;
        for (Student aluno : alunos) {
            soma += aluno.idade;
        }
        return (double) soma / alunos.length;
        
    }
    public void mais_jovens() {
        int menor1 = Integer.MAX_VALUE;
        int menor2 = Integer.MAX_VALUE;
        String aluno1 = "", aluno2 = "";
        for (Student aluno : alunos){
            if (aluno.idade < menor1){
                menor2 = menor1;
                aluno2 = aluno1;
                menor1 = aluno.idade;
                aluno1 = aluno.nome;
            }else if (aluno.idade < menor2){
                menor2 = aluno.idade;
                aluno2 = aluno.nome;
            }
        }
        System.out.println("Os dois mais jovens são: " + aluno1 + " e " + aluno2);
    }
    public void percentual_idades() {
        int cont = 0;
        for (Student aluno : alunos) {
            if (aluno.idade > 16) {
                cont += 1;
            }
        }
        double percentual = ((double) cont / alunos.length) * 100;
        System.out.println("Percentual de alunos acima de 16 anos é de: " + percentual + "%");
    }

    public void altura_superior() {
        double soma_a = 0;
        for (Student aluno : alunos) {
            soma_a += aluno.altura;
        }
        double media_a = soma_a / alunos.length;

        int cont = 0;
        for (Student aluno : alunos) {
            if (aluno.idade < 16 && aluno.altura > media_a) {
                cont += 1;
            }
        }
        System.out.println("Quantidade de alunos menores de 16 anos com altura superior a média: " + cont + " sendo a média da altura igual á: " + media_a);
    }

}
