import java.util.ArrayList;
import java.util.List;

public class Empresa_Lista3 {
    private List<Funcionario_Lista3> funcionarios;

    public Empresa_Lista3(){
        this.funcionarios = new ArrayList<>();
    }

    public void contratar(Funcionario_Lista3 funcionario){
        if (funcionario != null){
            funcionarios.add(funcionario);
            System.out.println("Funcionário " + funcionario.getNome() + " contratado!");
        }else{
            System.out.println("Funcionário inexistente!");
        }
    }
    public void demitir(Funcionario_Lista3 funcionario) {
        if (funcionario != null){
            funcionarios.remove(funcionario);
            System.out.println("Funcionário " + funcionario.getNome() + " demitido!");
        } else {
            System.out.println("Funcionário com ID " + funcionario + " não encontrado!");
        }
    }
    public void listar(){
        System.out.println("Funcionários: ");
        for (Funcionario_Lista3 funcionario : funcionarios){
            funcionario.exibir();
        }
    }
}
//Crie uma classe Empresa que agregue uma lista de funcionários. 
//Implemente métodos na Empresa para contratar e demitir funcionários, e listar todos os funcionários. 
//A existência de um funcionário deve ser independente da empresa.