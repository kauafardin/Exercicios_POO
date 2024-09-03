public class Main_Carro {
    public static void main(String[] args) {
        
        Carro uno = new Carro("Fiat", "Mille", 1994, 100000);
        Carro bmw = new Carro("BMW", "320i", 2017, 20000);

        uno.alterar_kilometragem_total(100500.0);
        uno.alterar_km_viajados(100575.0, false);

        bmw.alterar_kilometragem_total(100000.0);
        bmw.alterar_km_viajados(1500.0, true);

        uno.exibir();
        bmw.exibir();
    }
}
