public class Produto {
    String nome;
    double preco;
    int qtd_estoque;

    public Produto(String nome, double preco, int qtd_estoque){
        this.nome = nome;
        this.preco = preco;
        this.qtd_estoque = qtd_estoque;
    }
    public void adicionar(int quantidade){
        if (quantidade > 0){
            qtd_estoque += quantidade;
        } else{
            System.out.println("Quantidade inválida!");
        }
    }
    public void retirar(int quantidade){
        if (quantidade <= qtd_estoque && quantidade > 0){
            qtd_estoque -= quantidade;
        } else{
            System.out.println("Quantidade inválida!");
        }
    }
    public void ajustar_preco(double percentual){
        if (percentual != 0){
            preco += preco *(percentual/100);
        }else{
            System.out.println("Percentual inválido!");
        }
    }
    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + qtd_estoque);
    }
}

//Crie uma classe `Produto` com atributos `nome`, `preco` e `quantidadeEmEstoque`.
 
//Implemente um construtor para inicializar esses atributos.
 
//Adicione métodos para adicionar ou remover uma quantidade de produtos do estoque e para ajustar o preço do produto com base em um percentual de aumento ou desconto.