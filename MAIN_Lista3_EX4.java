public class MAIN_Lista3_EX4 {
    public static void main(String[] args) {
        Empresa_Lista3 empresa = new Empresa_Lista3();

        Funcionario_Lista3 funcionario1 = new Funcionario_Lista3("Kauã", "Estagiário");
        Funcionario_Lista3 funcionario2 = new Funcionario_Lista3("Héric", "Estagiário");
        Funcionario_Lista3 funcionario3 = new Funcionario_Lista3("João", "Gerente");

        empresa.contratar(funcionario1);
        empresa.contratar(funcionario2);
        empresa.contratar(funcionario3);

        empresa.demitir(funcionario3);

        empresa.listar();
    }
}
