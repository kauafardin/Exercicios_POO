public class Main_Empresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Funcionario_empresa funcionario1 = new Funcionario_empresa("Kauã Fardin", 5000.0);
        Funcionario_empresa funcionario2 = new Funcionario_empresa("João Pedro", 7000.0);
        Funcionario_empresa funcionario3 = new Funcionario_empresa("João Paulo", 8000.0);

        empresa.contratar(funcionario1);
        empresa.contratar(funcionario2);
        empresa.contratar(funcionario3);

        empresa.demitir("João Pedro");

        empresa.folha_pagamento();
    }
}
