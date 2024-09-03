public class Vendedor extends Funcionario {
    double total_vendas;

    public Vendedor(String nome, double salario, double total_vendas){
        super(nome, salario, "Vendedor");
        this.total_vendas = total_vendas;
    }
    public double calcular_bonus(){
        return total_vendas * 10;
    }

    public void exibir(){
        System.out.println("\nNome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Bônus: R$" + calcular_bonus());
    }
}
