public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public Funcionario(String nome, double salario, String cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

}

//Crie uma classe `Funcionario` com atributos `nome`, `salario`, e `cargo`.
//Crie classes derivadas `Gerente` e `Vendedor`, que herdem de `Funcionario`.
 
//Adicione um método para calcular o bônus de cada tipo de funcionário, onde o gerente tem um bônus fixo e o vendedor um bônus baseado em suas vendas.