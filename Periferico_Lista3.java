public class Periferico_Lista3 {
    private String nome;
    private String tipo;

    public Periferico_Lista3(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
    }
}

//Crie uma classe Periferico com atributos como nome e tipo (mouse, teclado, monitor). 
//Depois, crie uma classe Computador que contenha uma lista de periféricos como parte integrante do computador. 
//Ao destruir o objeto Computador, os periféricos também devem ser destruídos.
