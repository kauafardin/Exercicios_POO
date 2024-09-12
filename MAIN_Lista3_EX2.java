public class MAIN_Lista3_EX2 {
    public static void main(String[] args) {
        Universidade amf = new Universidade("AMF");

        Professor professor1 = new Professor("Kauã", "Engenharia de Software");
        Professor professor2 = new Professor("Héric", "Banco de Dados");

        amf.adicionar_professor(professor1);
        amf.adicionar_professor(professor2);

        amf.listarProfessores();

    }
}
