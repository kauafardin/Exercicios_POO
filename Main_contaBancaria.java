public class Main_contaBancaria {
    public static void main(String[] args) {
        
        Cliente cliente1  = new Cliente();
        Conta_Bancaria conta1 = new Conta_Bancaria();

        cliente1.nome = "Kauã Fardin";
        cliente1.cpf = "000.000.000-00";
        cliente1.endereco = "Rua Interior";

        conta1.numero_conta = "0000";
        conta1.cliente = cliente1;


        conta1.depositar(500);
        conta1.sacar(100);

        conta1.exibir_saldo();

        Cliente cliente2 = new Cliente();
        Conta_Bancaria conta2 = new Conta_Bancaria();

        cliente2.nome = "João Pedro";
        cliente2.cpf = "200.000.000-00";
        cliente2.endereco = "Rua Centro";

        conta2.numero_conta = "0002";
        conta2.cliente = cliente2;

        conta1.transferir(300, conta2);

        conta1.exibir_saldo();
        conta2.exibir_saldo();
    }
}










