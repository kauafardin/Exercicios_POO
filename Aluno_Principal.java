public class Aluno_Principal {
    public static void main(String[] args) {
        Aluno kaua = new Aluno();
        Aluno heric = new Aluno();

        kaua.nome = "Kauã";
        kaua.g1 = 8;
        kaua.g2 = 9;

        heric.nome = "Héric";
        heric.g1 = 7;
        heric.g2 = 9;

        kaua.calcular_media();
        heric.calcular_media();
        kaua.exibir();
        heric.exibir();
    }
}
