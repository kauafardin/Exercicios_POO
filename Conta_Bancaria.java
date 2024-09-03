
public class Conta_Bancaria {
    String numero_conta = "";
    double saldo = 0;
    Cliente cliente;
  
    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do saque deve ser menor que o saldo atual.");
        }
    }
    public void transferir(double valor, Conta_Bancaria conta_destino){
        if (valor > 0 && valor <= saldo){
            sacar(valor);
            conta_destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    public void exibir_saldo() {
        System.out.println("Saldo da conta " + numero_conta + ": R$" + saldo);
    }
}
//A classe `ContaBancaria` deve ter atributos como `numeroDaConta`, `saldo` e uma referência a um objeto `Cliente`.
//Implemente métodos para depositar, sacar e transferir dinheiro entre contas.