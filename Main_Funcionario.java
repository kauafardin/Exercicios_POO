public class Main_Funcionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Kauã", 10000, 500);
        Vendedor vendedor = new Vendedor("João Pedro", 5000, 120);

        gerente.calcular_bonus();
        vendedor.calcular_bonus();

        gerente.exibir();
        vendedor.exibir();

    }
}
