import java.util.ArrayList;
import java.util.List;
public class TimeDeFutebol_Lista3 {
    private List<Jogador_Lista3> jogadores;

    public TimeDeFutebol_Lista3(){
        this.jogadores = new ArrayList<>();
    }

    public void adicionarJogador(Jogador_Lista3 jogador){
        if (jogador != null){
            System.out.println("Jogador " + jogador.getNome() + " adicionado ao time!");
            jogadores.add(jogador);
        }else{
            System.out.println("Jogador inválido!");
        }
    }

    public void retirarJogador(String nome) {
        if (nome != null) {
            Jogador_Lista3 jogadorARemover = null;
            
            // Percorre a lista para encontrar o jogador com o nome correspondente
            for (Jogador_Lista3 jogador : jogadores) {
                if (jogador.getNome().equals(nome)) {
                    jogadorARemover = jogador;
                    break;
                }
            }
            
            if (jogadorARemover != null) {
                jogadores.remove(jogadorARemover);
                System.out.println("Jogador " + nome + " retirado do time!");
            } else {
                System.out.println("Jogador não encontrado!");
            }
        } else {
            System.out.println("Nome inválido!");
        }
    }
    

    public void exibir(){
        System.out.println("Jogadores:");
        for (Jogador_Lista3 jogador : jogadores){
            jogador.exibir();
        }
    }
    
}
