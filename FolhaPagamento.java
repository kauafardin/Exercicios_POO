

public class FolhaPagamento {
    Funcionario_ABC[] funcionarios;
    int cont_funcionarios;

    public FolhaPagamento() {
        funcionarios = new Funcionario_ABC[50]; // Inicializa o vetor com capacidade para 50 funcionários
    }
    public void adicionar_funcionario(Funcionario_ABC funcionario) {
        if (cont_funcionarios < funcionarios.length) {
            funcionarios[cont_funcionarios++] = funcionario;
        } else {
            System.out.println("Não é possível adicionar mais funcionários, o vetor está cheio.");
        }
    }
    public void ordenar() {
        for (int i = 0; i < cont_funcionarios - 1; i++) {
            for (int j = 0; j < cont_funcionarios - i - 1; j++) {
                if (funcionarios[j].calcular_salario() < funcionarios[j + 1].calcular_salario()) {
                    Funcionario_ABC temp = funcionarios[j];
                    funcionarios[j] = funcionarios[j + 1];
                    funcionarios[j + 1] = temp;
                }
            }
        }
    }
    public void exibir(){
        System.out.println("FUNCIONÁRIOS:");
        for (int i = 0; i < cont_funcionarios; i++){
            funcionarios[i].exibir();
        }
    }
    public static void main(String[] args) {
        FolhaPagamento folha1 = new FolhaPagamento();

        Funcionario_ABC funcionario1 = new Funcionario_ABC(1, 160, 10);
        Funcionario_ABC funcionario2 = new Funcionario_ABC(2, 200, 20);
        Funcionario_ABC funcionario3 = new Funcionario_ABC(3, 310, 30);
        Funcionario_ABC funcionario4 = new Funcionario_ABC(4, 250, 40);

        folha1.adicionar_funcionario(funcionario1);
        folha1.adicionar_funcionario(funcionario2);
        folha1.adicionar_funcionario(funcionario3);
        folha1.adicionar_funcionario(funcionario4);

        funcionario1.qtd_horas_extras = 5;
        funcionario2.qtd_horas_extras = 10;
        funcionario3.qtd_horas_extras = 4;
        funcionario4.qtd_horas_extras = 7;


        folha1.ordenar();
        folha1.exibir();
    }
}
    

