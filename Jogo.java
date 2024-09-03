import java.util.List;
import java.util.ArrayList;

public class Jogo {
    String nome;
    String data_lancamento;
    List<Jogador> jogadores = new ArrayList<>();

    public Jogo(String nome, String data_lancamento){
        this.nome = nome;
        this.data_lancamento = data_lancamento;
    }
    public void adicionar_jogadores(Jogador jogador){
        jogadores.add(jogador);
        System.out.println("Jogador " + jogador.nome + " adicionado com sucesso!");
    }
    public void exibir_ranking(){
        for (int i = 0; i < jogadores.size(); i++) {
            for (int j = i + 1; j < jogadores.size(); j++) {
                if (jogadores.get(i).pontuacao < jogadores.get(j).pontuacao) {
                    Jogador temp = jogadores.get(i);
                    jogadores.set(i, jogadores.get(j));
                    jogadores.set(j, temp);
                }
            }
        }
        System.out.println("\nRanking dos Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.nome + " - Pontuação: " + jogador.pontuacao);
        }
    }
    public void promover_jogador(){
        for (Jogador jogador : jogadores) {
            int nivelAtual = jogador.nivel;
            int pontos = jogador.pontuacao;
            int novoNivel = pontos / 1000;

            if (novoNivel > nivelAtual) {
                jogador.nivel = novoNivel; // Corrigido para atualizar o nível do jogador
                System.out.println("\n" + jogador.nome+ " foi promovido para o nível " + jogador.nivel);
            }
        }

    }
}

//Crie uma classe `Jogo` com atributos `nome`, `dataLancamento`, e uma lista de objetos `Jogador`.
//Adicione métodos na classe `Jogo` para adicionar jogadores, 
//exibir o ranking dos jogadores baseado na pontuação, e promover jogadores com base em seu desempenho.