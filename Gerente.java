public class Gerente extends Funcionario {
    double bonus_fixo;

    public Gerente(String nome, double salario, double bonus_fixo){
        super(nome, salario, "Gerente");
        this.bonus_fixo = bonus_fixo;
    }
    public double calcular_bonus(){
        return bonus_fixo;
    }

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Bônus: R$" + bonus_fixo);
    }
}
