public class MAIN_Lista3_EX8 {
    public static void main(String[] args) {
        Escola_Lista3 escola = new Escola_Lista3();

        Estudante_Lista3 estudante1 = new Estudante_Lista3("Kauã Fardin", 10);
        Estudante_Lista3 estudante2 = new Estudante_Lista3("Héric Rian", 20);
        Estudante_Lista3 estudante3 = new Estudante_Lista3("Rafaela Pettermann", 30);

        escola.matricular(estudante1);
        escola.matricular(estudante2);
        escola.matricular(estudante3);

        escola.listar();
    }
}
