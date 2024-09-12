public class Funcionario_Lista3 {
    private String nome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario_Lista3(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
    }
}






//Implemente uma classe Funcionario com atributos como nome e cargo. 
