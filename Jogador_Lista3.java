public class Jogador_Lista3 {
    private String nome;
    private String posicao;

    public Jogador_Lista3(String nome, String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void exibir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Posição: " + posicao);
    }
}

//Implemente uma classe Jogador com atributos como nome e posição. 
//Em seguida, crie uma classe TimeDeFutebol que agregue uma lista de jogadores. 
//A existência de um jogador não depende do time. Implemente métodos para adicionar e remover jogadores do time.
