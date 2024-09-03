public class Main_Veiculo {
    public static void main(String[] args) {
        Motor motorGol = new Motor(100, "Gasolina");
        Veiculo gol = new Veiculo("Volkswagen", "GOL", 2011, motorGol);

        Motor motorFerrari = new Motor(720, "Gasolina");
        Veiculo ferrari = new Veiculo("Ferrari", "488 GTB", 2024, motorFerrari);

        gol.ligar_motor();
        ferrari.ligar_motor();

        ferrari.desligar_motor();

        gol.exibir_veiculo();
        ferrari.exibir_veiculo();
    }
}
