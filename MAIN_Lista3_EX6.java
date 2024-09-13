public class MAIN_Lista3_EX6 {
    public static void main(String[] args) {
        TimeDeFutebol_Lista3 time1 = new TimeDeFutebol_Lista3();

        Jogador_Lista3 jogador1 = new Jogador_Lista3("Kauã Fardin", "Zagueiro");
        Jogador_Lista3 jogador2 = new Jogador_Lista3("João Pedro", "Lateral");
        Jogador_Lista3 jogador3 = new Jogador_Lista3("Héric Rian", "Volante");

        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);
        time1.adicionarJogador(jogador3);

        time1.retirarJogador("João Pedro");

        time1.exibir();
    }
}
