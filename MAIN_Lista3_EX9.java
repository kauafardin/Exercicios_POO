public class MAIN_Lista3_EX9 {
    public static void main(String[] args) {
        Computador_Lista3_EX9 computador = new Computador_Lista3_EX9("PC Desktop");

        computador.adicionarPeriferico("Logitech MX Master 3", "Mouse");
        computador.adicionarPeriferico("Corsair K95 RGB Platinum", "Teclado");
        computador.adicionarPeriferico("Dell UltraSharp U2720Q", "Monitor");
        
        computador.listar();
    }
}
