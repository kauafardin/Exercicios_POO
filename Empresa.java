import java.util.List;
import java.util.ArrayList;
public class Empresa {
    List<Funcionario_empresa> funcionarios = new ArrayList<>();

    public void contratar(Funcionario_empresa funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.nome + " foi contratado!\n");
    }
    public void demitir(String nome){
        boolean encontrado = false;
        for (Funcionario_empresa funcionario : funcionarios){
            if (nome.equals(funcionario.nome)){
                funcionarios.remove(funcionario);
                System.out.println("Funcionário " + funcionario.nome + " foi demitido!\n");
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Funcionário não encontrado!\n");
        }
    }
    public void folha_pagamento(){
        double total = 0;
        for (Funcionario_empresa funcionario : funcionarios){
            total += funcionario.salario;
        }
        System.out.println("Total da folha de pagamentos da empresa: R$" + total);
    }
}

//Crie uma classe `Empresa` que possui uma lista de objetos `Funcionario`.

//Implemente métodos para contratar um novo funcionário, demitir um funcionário, e calcular a folha de pagamento total da empresa.