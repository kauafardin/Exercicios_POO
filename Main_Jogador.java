public class Main_Jogador {
    public static void main(String[] args) {
        Jogo counter_strike = new Jogo("Counter Strike", "08/11/1999");
        
        Jogador jogador1 = new Jogador("Kauã", 2, 3500);
        Jogador jogador2 = new Jogador("João", 3, 3000);
        Jogador jogador3 = new Jogador("Maria", 2, 4400);
        Jogador jogador4 = new Jogador("Ana", 1, 2800);

        counter_strike.adicionar_jogadores(jogador1);
        counter_strike.adicionar_jogadores(jogador2);
        counter_strike.adicionar_jogadores(jogador3);
        counter_strike.adicionar_jogadores(jogador4);

        counter_strike.exibir_ranking();

        counter_strike.promover_jogador();
    }
}
