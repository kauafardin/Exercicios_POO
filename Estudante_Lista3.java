public class Estudante_Lista3 {
    private String nome;
    private int matricula;

    public Estudante_Lista3(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}


//Crie uma classe Estudante com atributos como nome e matrícula. 
//Em seguida, crie uma classe Escola que agregue uma lista de estudantes. 
//A escola deve ter métodos para matricular e listar os estudantes. 
//A existência de um estudante não deve depender da escola.